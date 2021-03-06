USE [master]
GO
/****** Object:  Database [KLShop]    Script Date: 23/07/2022 6:46:11 PM ******/
CREATE DATABASE [KLShop]
 CONTAINMENT = NONE
GO
ALTER DATABASE [KLShop] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [KLShop].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [KLShop] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [KLShop] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [KLShop] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [KLShop] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [KLShop] SET ARITHABORT OFF 
GO
ALTER DATABASE [KLShop] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [KLShop] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [KLShop] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [KLShop] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [KLShop] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [KLShop] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [KLShop] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [KLShop] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [KLShop] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [KLShop] SET  DISABLE_BROKER 
GO
ALTER DATABASE [KLShop] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [KLShop] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [KLShop] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [KLShop] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [KLShop] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [KLShop] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [KLShop] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [KLShop] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [KLShop] SET  MULTI_USER 
GO
ALTER DATABASE [KLShop] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [KLShop] SET DB_CHAINING OFF 
GO
ALTER DATABASE [KLShop] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [KLShop] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [KLShop] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [KLShop] SET QUERY_STORE = OFF
GO
USE [KLShop]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [bigint] IDENTITY(1,1) NOT NULL,
	[MaKH] [nvarchar](5) NOT NULL,
	[TenTK] [nvarchar](10) NOT NULL,
	[NgayTao] [date] NOT NULL,
	[TrangThai] [bit] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonCT]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonCT](
	[MaHDCT] [bigint] IDENTITY(1,1) NOT NULL,
	[MaHD] [bigint] NOT NULL,
	[MaSP] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
 CONSTRAINT [PK_HoaDonCT] PRIMARY KEY CLUSTERED 
(
	[MaHDCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [nvarchar](5) NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL,
	[NamSinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[SDT] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KichThuoc]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KichThuoc](
	[MaKT] [int] IDENTITY(1,1) NOT NULL,
	[TenKT] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_KichThuoc] PRIMARY KEY CLUSTERED 
(
	[MaKT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiSP]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSP](
	[MaLoai] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiSP] PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](5) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[NamSinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[DiaChi] [nvarchar](max) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[SDT] [nvarchar](50) NOT NULL,
	[Hinh] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [int] IDENTITY(1,1) NOT NULL,
	[TenSP] [nvarchar](50) NOT NULL,
	[Loai] [int] NOT NULL,
	[DonGia] [float] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[MoTa] [nvarchar](max) NOT NULL,
	[Hinh] [nvarchar](max) NOT NULL,
	[KichThuoc] [int] NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 23/07/2022 6:46:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TenTK] [nvarchar](10) NOT NULL,
	[MaNV] [nvarchar](5) NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[VaiTro] [bit] NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[TenTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_TaiKhoan] FOREIGN KEY([TenTK])
REFERENCES [dbo].[TaiKhoan] ([TenTK])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_TaiKhoan]
GO
ALTER TABLE [dbo].[HoaDonCT]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonCT_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[HoaDonCT] CHECK CONSTRAINT [FK_HoaDonCT_HoaDon]
GO
ALTER TABLE [dbo].[HoaDonCT]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonCT_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[HoaDonCT] CHECK CONSTRAINT [FK_HoaDonCT_SanPham]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_KichThuoc] FOREIGN KEY([KichThuoc])
REFERENCES [dbo].[KichThuoc] ([MaKT])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_KichThuoc]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSP] FOREIGN KEY([Loai])
REFERENCES [dbo].[LoaiSP] ([MaLoai])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSP]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
USE [master]
GO
ALTER DATABASE [KLShop] SET  READ_WRITE 
GO
