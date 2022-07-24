create database KLShop

create table NhanVien(
	MaNV nvarchar(5) NOT NULL primary key,
	HoTen nvarchar(50) NOT NULL,
	NamSinh date NOT NULL,
	GioiTinh bit default 1 NOT NULL,
	DiaChi nvarchar(MAX) NOT NULL,
	Email nvarchar(50) NOT NULL,
	SDT nvarchar(50) NOT NULL,
	Hinh nvarchar(MAX) NULL
)

create table TaiKhoan (
	TenTK nvarchar(10) NOT NULL primary key,
	MaNV nvarchar(5) NOT NULL foreign key (MaNV) references NhanVien(MaNV),
	MatKhau nvarchar(50) NOT NULL,
	VaiTro bit default 0 NOT NULL

)

create table LoaiSP(
	MaLoai int identity(1,1) NOT NULL primary key,
	TenLoai nvarchar(50) NOT NULL
)

create table KichThuoc(
	MaKT int identity(1,1) NOT NULL primary key,
	TenTK nvarchar(50) NOT NULL
)

create table SanPham(
	MaSP int identity(1,1) NOT NULL primary key,
	TenSP nvarchar(50) NOT NULL,
	Loai int NOT NULL foreign key (Loai) references LoaiSP(MaLoai),
	DonGia float NOT NULL,
	SoLuong int NOT NULL,
	MoTa nvarchar(MAX) NOT NULL,
	Hinh nvarchar(MAX) NULL,
	KichThuoc int NOT NULL foreign key (KichThuoc) references KichThuoc(MaKT)
)
create table KhachHang(
	MaKH nvarchar(5) NOT NULL primary key,
	TenKH nvarchar(50) NOT NULL,
	NamSinh date NOT NULL,
	GioiTinh bit default 1 NOT NULL,
	DiaChi nvarchar(50) NOT NULL,
	Email nvarchar(50) NOT NULL,
	SDT nvarchar(50) NOT NULL
)

create table HoaDon(
	MaHD bigint identity(1,1) NOT NULL primary key,
	MaKH nvarchar(5) NOT NULL foreign key (MaKH) references KhachHang(MaKH),
	TenTK nvarchar(10) NOT NULL foreign key (TenTK) references TaiKhoan(TenTK),
	NgayTao date NOT NULL,
	TrangThai bit default 0 NOT NULL
)

create table HoaDonCT(
	MaHDCT bigint identity(1,1) NOT NULL primary key,
	MaHD bigint NOT NULL foreign key (MaHD) references HoaDon(MaHD),
	MaSP int NOT NULL foreign key (MaSP) references SanPham(MaSP),
	SoLuong int NOT NULL
)

create proc sp_ThongKeDoanhThu (@year int)
AS BEGIN 
   SELECT
      sp.TenSP Ten,
	  SUM(ct.SoLuong) SoLuong,
	  COUNT(DISTINCT hd.MaKH) SoKH,
	  SUM(sp.DonGia*ct.SoLuong) DoanhThu
   FROM HoaDon hd
	JoiN HoaDonCT ct ON hd.MaHD = ct.MaHD
	join SanPham sp ON sp.MaSP = ct.MaSP
	WHERE YEAR(NgayTao) = @year
	GROUP BY sp.TenSP
END

create PROC sp_ThongKeDoanhThu1  @month int, @year int
AS BEGIN 
   SELECT
      sp.TenSP Ten,
	  SUM(ct.SoLuong) SoLuong,
	  COUNT(DISTINCT hd.MaKH) SoKH,
	  SUM(sp.DonGia*ct.SoLuong) DoanhThu
   FROM HoaDon hd
	JoiN HoaDonCT ct ON hd.MaHD = ct.MaHD
	join SanPham sp ON sp.MaSP =ct.MaSP
	WHERE  MONTH(NgayTao)= @month and YEAR(NgayTao)= @year
	GROUP BY sp.TenSP
END
