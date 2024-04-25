--drop table Thue
--drop table Tamvang
--drop table Tamtru
--drop table Lyhon
--drop table QuanHe
--drop table HoKhau
--drop table GiayChungTu
--drop table DangNhap
--drop table Cnkh
--drop table DanhGia
--drop table CongDan
--drop table KhaiSinh
--Go
--drop database QuanLyDanCuDoThi
create database QuanLyDanCuDoThi
go
use QuanLyDanCuDoThi

go

create table KhaiSinh
(
	ID integer identity(1,1) not null constraint Mks_ID unique,
	MaKS as right('KS0' + cast(ID as varchar(10)),10) persisted constraint PK_Mks primary key clustered,
	HoTenKS nvarchar(255),
	GioiTinh nvarchar(20),
	NgaySinh date,
	NoiSinh nvarchar(100),
	DanToc nvarchar(20),
	QuocTich nvarchar(20),
	QueQuan nvarchar(100),
	Cha nvarchar(20),
	Me nvarchar(20),
	NguoiKhaiSinh nvarchar(20),
	QuanHe nvarchar(100),
	NgayDk date,
	NoiDk nvarchar(100),
	TrangThai int
)
insert into KhaiSinh(HoTenKS, GioiTinh, NgaySinh, NoiSinh, DanToc, QuocTich, QueQuan, Cha, Me, NguoiKhaiSinh,QuanHe, NgayDk, NoiDk, TrangThai)
values (N'Phạm Văn T',N'Nam', '1978-05-10', N'TP. Hồ Chí Minh', N'Kinh', N'Việt Nam', N'TP. Hồ Chí Minh', '083078008462', '083078008463', '083078008462', N'Cha', '1978-06-01', N'TP. Hồ Chí Minh', 1)
	,(N'Đinh Thị Kim H',N'Nữ', '1979-07-03', N'TP. Hồ Chí Minh', N'Kinh', N'Việt Nam', N'TP. Hồ Chí Minh', '083078002562', '083078005163', '083078008462', N'Mẹ', '1979-08-05', N'TP. Hồ Chí Minh', 1)
	,(N'Phạm Thị Phương N',N'Nữ', '2003-09-01', N'TP. Hồ Chí Minh', N'Kinh', N'Việt Nam', N'TP. Hồ Chí Minh', '083303008061', '083303008072', '083303008061', N'Cha', '2003-09-10', N'TP. Hồ Chí Minh', 1)
	,(N'Phạm Nhat T', N'Nam', '2008-01-21', N'TP. Hồ Chí Minh', N'Kinh', N'Việt Nam', N'TP. Hồ Chí Minh', '083303008071', '083303048071', '083303008071', N'Cha', '2008-01-30', N'TP. Hồ Chí Minh', 1)
	,(N'Lê Hoàng L', N'Nam', '1965-12-10', N'TP HCM', N'Kinh', N'Việt Nam', N'Bình Dương', '092174003985', '092174003984', '092174003985', N'Cha', '1695-12-21', N'Bình Dương', 1)
	,(N'Hoàng Thị Thùy D', N'Nữ', '1968-01-24', N'Đồng Nai', N'Kinh', N'Việt Nam', N'Đồng Nai', '091301724456', '091301721156', '091301724456', N'Cha', '1968-02-20', N'Đồng Nai', 1)
	,(N'Lê Minh D', N'Nam', '2000-11-22', N'Bình Dương', N'Kinh', N'Việt Nam', N'Bình Dương', '09217400315', '09217400415', '09217400315', N'Cha', '2000-11-29', N'Bình Dương', 1)

	,(N'Đinh Văn Sấu', N'Nam', '1950-11-22', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083003001234', '083303004545', '083003001234', N'Cha', '1951-01-01', N'Bến Tre', 1)
	,(N'Phạm Thị Sáng', N'Nu', '1948-01-12', N'Cà Mau', N'Kinh', N'Việt Nam', N'Bến Tre', '083003004567', '083303001478', '083303001478', N'Cha', '1948-01-20', N'Bến Tre', 1)
	,(N'Đinh Văn Thanh', N'Nam', '1969-10-12', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1969-11-12', N'Bến Tre', 1)
	,(N'Đinh Văn Nhung', N'Nam', '1976-04-23', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1976-05-23', N'Bến Tre', 1)
	,(N'Đinh Văn Liêm', N'Nam', '1972-05-22', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1972-06-22', N'Bến Tre', 1)
	,(N'Đinh Công Tiền', N'Nam', '1983-04-22', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1983-04-22', N'Bến Tre', 1)
	,(N'Đinh Thị Kim Hương', N'Nu', '1979-07-04', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1979-08-04', N'Bến Tre', 1)
	,(N'Đinh Thị Kim Dung', N'Nu', '1976-01-21', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1976-01-21', N'Bến Tre', 1)
	,(N'Đinh Thị Kim Phụng', N'Nu', '1981-07-12', N'Bến Tre', N'Kinh', N'Việt Nam', N'Bến Tre', '083303001234', '083303007894', '083303001234', N'Cha', '1981-07-12', N'Bến Tre', 1)

	,(N'Phạm Văn Láng', N'Nam', '1951-11-22', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '083003001247', '023324328743', '083003001247', N'Cha', '1952-01-01', N'Bến Tre', 1)
	,(N'Nguyễn Thị Nhan', N'Nu', '1952-01-12', N'Quảng Nam', N'Kinh', N'Việt Nam', N'Bến Tre', '024451228457', '034572551784', '024451228457', N'Cha', '1952-01-20', N'Bến Tre', 1)
	,(N'Phạm Thị Nhe', N'Nam', '1970-10-12', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1970-11-12', N'Bến Tre', 1)
	,(N'Phạm Thị Nhé', N'Nam', '1972-04-23', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1972-05-23', N'Bến Tre', 1)
	,(N'Phạm Văn Lơn', N'Nam', '1977-05-22', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1977-06-22', N'Bến Tre', 1)
	,(N'Phạm Văn Tơn', N'Nam', '1978-04-22', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1978-04-22', N'Bến Tre', 1)
	,(N'Phạm Văn Tuân', N'Nam', '1979-07-04', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1979-08-04', N'Bến Tre', 1)
	,(N'Phạm Thị Nhi', N'Nu', '1981-01-21', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1981-01-21', N'Bến Tre', 1)
	,(N'Phạm Thị Mộng Nghi', N'Nu', '1992-07-12', N'Bình Phước', N'Kinh', N'Việt Nam', N'Bến Tre', '023303001234', '023303007894', '023303001234', N'Cha', '1992-07-12', N'Bến Tre', 1)
create table CongDan
(
	CCCD nvarchar(20) primary key,
	HoTen nvarchar(255),
	NcCccd nvarchar(50),
	NgcCccd date, 
	MaKS varchar(10) references KhaiSinh(MaKS),
	SDT nvarchar(20),
	Email nvarchar(50),
	TrangThai int
)

insert into CongDan(CCCD, HoTen, NcCccd, NgcCccd, MaKS, SDT, Email, TrangThai)
values ('083303008061',N'Phạm Văn T', N'TP. Hồ Chí Minh', '2021-12-21', 'KS01', '0814096656', 'phamvant@gmail.com', 1)
	 ,('083303008072',N'Đinh Thị Kim H', N'TP. Hồ Chí Minh', '2021-12-20', 'KS02', '0814096245', 'dinhthikimh@gmail.com', 1)
	 ,('083303008211',N'Phạm Thị Phương N', N'TP. Hồ Chí Minh', '2021-12-21', 'KS03', '0987455412', 'phamthiphuongn@gmail.com', 1)
	 ,('083303008161',N'Phạm Nhat T', N'TP. Hồ Chí Minh', '2022-12-27', 'KS04', '0358046675', 'phamnhatt@gmail.com', 1)
	 ,('083303002561',N'Lê Hoàng L', N'Bình Dương', '2021-10-12', 'KS05', '0912124748', 'lehoangl@gmail.com', 1)
	 ,('083303003061',N'Hoàng Thị Thùy D', N'Đồng Nai', '2021-10-10', 'KS06', '0345696784', 'hoangthithuyd@gmail.com', 0)
	 ,('083303008761',N'Lê Minh D', N'Bình Dương', '2023-01-20', 'KS07', '0754141469', 'leminhd@gmail.com', 1)

	 ,('083303001234',N'Đinh Văn Sấu', N'Bến Tre', '2020-02-20', 'KS08', '0345746645', 'dinhvans@gmail.com', 0)
	 ,('083303007894',N'Phạm Thị Sáng', N'Bến Tre', '2020-02-22', 'KS09', '0745415844', 'phamthis@gmail.com', 1)
	 ,('083303004512',N'Đinh Văn Thanh', N'Bến Tre', '2020-02-20', 'KS010', '0345746645', 'dinhvanthanh@gmail.com', 1)
	 ,('083303007814',N'Đinh Văn Nhung', N'Bến Tre', '2020-02-20', 'KS011', '0345746645', 'dinhvannhung@gmail.com', 1)
	 ,('083301479547',N'Đinh Văn Liêm', N'Bến Tre', '2020-02-20', 'KS012', '0345746645', 'dinhvanliem@gmail.com', 1)
	 ,('083301726548',N'Đinh Công Tiền', N'Bến Tre', '2020-02-20', 'KS013', '0345746645', 'dinhcongtien@gmail.com', 1)
	 ,('083305656254',N'Đinh Thị Kim Hương', N'Bến Tre', '2020-02-20', 'KS014', '0345746645', 'dinhthikimhuong@gmail.com', 1)
	 ,('082007451678',N'Đinh Thị Kim Dung', N'Bến Tre', '2020-02-20', 'KS015', '0345746645', 'dinhthikimdung@gmail.com', 1)
	 ,('083301234757',N'Đinh Thị Kim Phụng', N'Bến Tre', '2020-02-20', 'KS016', '0345746645', 'dinhthikimphung@gmail.com', 1)

	 ,('023303001234',N'Phạm Văn Láng', N'Bến Tre', '2020-02-20', 'KS017', '0345746645', 'phamvanlang@gmail.com', 1)
	 ,('023303007894',N'Nguyễn Thị Nhan', N'Bến Tre', '2020-02-22', 'KS018', '0745415844', 'nguyenthinhan@gmail.com', 1)
	 ,('023303004512',N'Phạm Thị Nhe', N'Bến Tre', '2020-02-20', 'KS019', '0345746645', 'phamthinhe@gmail.com', 1)
	 ,('013303007814',N'Phạm Thị Nhé', N'Bến Tre', '2020-02-20', 'KS020', '0345746645', 'phamthinhes@gmail.com', 1)
	 ,('013301479547',N'Phạm Văn Lơn', N'Bến Tre', '2020-02-20', 'KS021', '0345746645', 'phamvanlon@gmail.com', 1)
	 ,('023301726548',N'Phạm Văn Tơn', N'Bến Tre', '2020-02-20', 'KS022', '0345746645', 'phamvanton@gmail.com', 1)
	 ,('043305656254',N'Phạm Văn Tuân', N'Bến Tre', '2020-02-20', 'KS023', '0345746645', 'phamvantuan@gmail.com', 1)
	 ,('062007451678',N'Phạm Thị Nhi', N'Bến Tre', '2020-02-20', 'KS024', '0345746645', 'phamthinhi@gmail.com', 1)
	 ,('033301234757',N'Phạm Thị Mộng Nghi', N'Bến Tre', '2020-02-20', 'KS025', '0345746645', 'phamthimongnghi@gmail.com', 1)
create table Tamtru
(
	ID integer identity(1,1) not null constraint Mtt_ID unique,
	MaTT as right('TT0' + cast(ID as varchar(10)),10) persisted constraint PK_Mtt primary key clustered,
	Cccd nvarchar(20) references CongDan(CCCD),
	Ngaydk date,
	Noidk nvarchar(100),
	Ngayden date,
	Ngaydi date,
	Lydo nvarchar(255),
	TrangThai int
)
insert into Tamtru (CCCD, Ngaydk, Noidk, Ngayden, Ngaydi, Lydo, TrangThai)
values ('083303008211', '2023-01-02', N'TP HCM', '2023-01-01','2025-01-01', N'Làm công ty', 1)
,('083303008761', '2021-02-20', N'TP HCM', '2021-02-10','2023-02-10',	N'Điều trị bệnh', 1)
,('083303008761', '2023-03-01', N'TP HCM', '2023-02-10','2024-02-10',	N'Điều trị bệnh', 1)

,('083301234757', '2024-02-20', N'TP HCM', '2024-02-10','2026-02-10',	N'Làm công ty', 1)
,('083303004512', '2024-01-01', N'TP HCM', '2024-01-01','2026-01-01',	N'Làm công ty', 1)
,('083303007814', '2024-01-02', N'TP HCM', '2024-01-02','2026-01-02',	N'Làm công ty', 1)
,('083301479547', '2023-02-20', N'TP HCM', '2023-02-20','2025-02-20',	N'Làm công ty', 1)
,('083301726548', '2022-12-02', N'TP HCM', '2022-12-02','2024-12-02',	N'Làm công ty', 1)
,('083305656254', '2021-12-05', N'TP HCM', '2021-12-05','2023-12-05',	N'Làm công ty', 1)
,('082007451678', '2021-07-20', N'TP HCM', '2021-07-20','2023-07-20',	N'Làm công ty', 1)

,('033301234757', '2021-02-10', N'Hà Nội', '2021-02-10','2023-02-10',	N'Làm công ty', 1)
,('062007451678', '2021-01-01', N'Hà Nội', '2021-01-01','2023-01-01',	N'Làm công ty', 1)
,('043305656254', '2022-01-02', N'Hà Nội', '2022-01-02','2024-01-02',	N'Làm công ty', 1)
,('023301726548', '2021-02-20', N'Hà Nội', '2021-02-20','2023-02-20',	N'Làm công ty', 1)
,('013301479547', '2024-12-02', N'Hà Nội', '2024-12-02','2026-12-02',	N'Làm công ty', 1)
,('013303007814', '2024-12-02', N'Hà Nội', '2024-12-02','2024-12-05',	N'Làm công ty', 1)
,('023303004512', '2023-07-20', N'Hà Nội', '2023-07-20','2025-07-20',	N'Làm công ty', 1)

create table Tamvang
(
	ID integer identity(1,1) not null constraint Mtv_ID unique,
	MaTV as right('TV0' + cast(ID as varchar(10)),10) persisted constraint PK_Mtv primary key clustered,
	CCCD nvarchar(20) references CongDan(CCCD),
	Ngaydk date,
	Ncdi nvarchar(50),
	Ncden nvarchar(50),
	Ngaydi	date,
	Ngayve	date,
	Lydo nvarchar(100),
	TrangThai int
)

insert into Tamvang (CCCD, Ngaydk, Ncdi, Ncden, Ngaydi, Ngayve, Lydo, TrangThai)
values ('083303008211', '2022-12-30', N'TP. Hồ Chí Minh', N'TP HCM', '2023-01-01','2025-01-01', N'Làm công ty', 1)
	,('083303008761', '2021-02-01',N'Bình Dương', N'TP HCM', '2021-02-10','2023-02-10',	N'Điều trị bệnh', 1)
	,('083303008761', '2023-02-25',N'Bình Dương', N'TP HCM', '2023-02-10','2024-02-10',	N'Điều trị bệnh', 1)

	,('083301234757', '2024-02-20',N'Bến Tre', N'TP HCM', '2024-02-10','2026-02-10',	N'Làm công ty', 1)
	,('083303004512', '2021-01-01',N'Bến Tre', N'TP HCM', '2021-01-01','2026-01-01',	N'Làm công ty', 1)
	,('083303007814', '2024-01-02',N'Bến Tre', N'TP HCM', '2024-01-02','2026-01-02',	N'Làm công ty', 1)
	,('083301479547', '2021-02-20',N'Bến Tre', N'TP HCM', '2021-02-20','2025-02-20',	N'Làm công ty', 1)
	,('083301726548', '2022-12-02',N'Bến Tre', N'TP HCM', '2022-12-02','2024-12-02',	N'Làm công ty', 1)
	,('083305656254', '2021-12-05',N'Bến Tre', N'TP HCM', '2021-12-05','2023-12-05',	N'Làm công ty', 1)
	,('082007451678', '2021-07-20',N'Bến Tre', N'TP HCM', '2021-07-20','2023-07-20',	N'Làm công ty', 1)

	,('033301234757', '2021-02-10',N'Bến Tre', N'TP HCM', '2021-02-10','2023-02-10',	N'Làm công ty', 1)
	,('062007451678', '2021-01-01',N'Bến Tre', N'TP HCM', '2021-01-01','2023-01-01',	N'Làm công ty', 1)
	,('043305656254', '2022-01-02',N'Bến Tre', N'TP HCM', '2022-01-02','2024-01-02',	N'Làm công ty', 1)
	,('023301726548', '2021-02-20',N'Bến Tre', N'TP HCM', '2021-02-20','2023-02-20',	N'Làm công ty', 1)
	,('013301479547', '2024-12-02',N'Bến Tre', N'TP HCM', '2024-12-02','2026-12-02',	N'Làm công ty', 1)
	,('013303007814', '2024-12-02',N'Bến Tre', N'TP HCM', '2024-12-02','2026-12-05',	N'Làm công ty', 1)
	,('023303004512', '2023-07-20',N'Bến Tre', N'TP HCM', '2023-07-20','2025-07-20',	N'Làm công ty', 1)
create table Thue
(
	ID integer identity(1,1) not null constraint Mst_ID unique,
	Masothue as right('TH0' + cast(ID as varchar(10)),10) persisted constraint PK_Mst primary key clustered,
	Coquanthue nchar(100),
	SoCMT_CCCD nvarchar(20)references CongDan(Cccd),
	Ngaythaydoithongtingannhat datetime,
	TrangThai int
)
insert into Thue (Coquanthue, SoCMT_CCCD, Ngaythaydoithongtingannhat, TrangThai)
values (N'Cục thuế tỉnh TP. Hồ Chí Minh', '083303008061', '2022-01-20', 1)
	, (N'Cục thuế tỉnh TP. Hồ Chí Minh', '083303008072', '2022-05-12', 1)
	, (N'Cục thuế tỉnh Bình Dương', '083303002561', '2021-07-14', 1)
	, (N'Cục thuế tỉnh Đồng Nai', '083303008061', '2021-12-22', 1)
create table Cnkh
(
	ID integer identity(1,1) not null constraint Mcnkh_ID unique,
	MaCnkh as right('KH0' + cast(ID as varchar(10)),10) persisted constraint PK_Mcnkh primary key clustered,
	CccdVo nvarchar(20)references CongDan(Cccd),
	CccdChong nvarchar(20)references CongDan(Cccd),
	Noidk nvarchar(100),
	Ngaydk date,
	TrangThai int
);
insert into Cnkh (CccdVo, CccdChong, Noidk, Ngaydk, TrangThai)
values ('083303008072', '083303008061', N'Ủy ban nhân dân xã TTB', '2002-10-11', 1)
	, ('083303003061', '083303002561', N'Ủy ban nhân dân tỉnh Bình Dương', '1993-04-12', 0)
	, ('023303004512', '083303004512', N'Ủy ban nhân dân tỉnh Bến Tre', '1999-04-13', 0)
	, ('013303007814', '083303007814', N'Ủy ban nhân dân tỉnh Bến Tre', '2000-07-12', 0)
	, ('082007451678', '013301479547', N'Ủy ban nhân dân tp Hồ Chí Minh', '2001-01-12', 0)
	, ('083301234757', '043305656254', N'Ủy ban nhân dân tp Hồ Chí Minh', '2008-04-27', 0)
create table Lyhon
(
	ID integer identity(1,1) not null constraint Mlh_ID unique,
	MaLh as right('LH0' + cast(ID as varchar(10)),10) persisted constraint PK_Mlh primary key clustered,
	MaCnkh varchar(10) references Cnkh(MaCnkh),
	CccdNguoiNopDon nvarchar(20) references CongDan(CCCD),
	Noidk nvarchar(100),
	Ngaydk date,
	Lydo nvarchar(255),
	TrangThai int
)

insert into Lyhon (MaCnkh, CccdNguoiNopDon, Noidk, Ngaydk, Lydo, TrangThai)
values ('KH02', '083303003061', N'Ủy ban nhân dân xã TTB', '2017-03-23', N'Không hòa hợp', 1)
,('KH03', '023303004512', N'Ủy ban nhân dân xã VVT', '2021-03-23', N'Không hòa hợp', 1)
,('KH04', '083303007814', N'Ủy ban nhân dân xã AT2', '2020-04-23', N'Không hòa hợp', 1)
,('KH05', '013301479547', N'Ủy ban nhân dân xã LKH', '2017-03-23', N'Không hòa hợp', 1)
,('KH06', '083301234757', N'Ủy ban nhân dân xã PUV', '2018-12-23', N'Không hòa hợp', 1)
create table HoKhau
(
	ID integer identity(1,1) not null constraint Mhk_ID unique,
	MaHK as right('HK0' + cast(ID as varchar(10)),10) persisted constraint PK_Mhk primary key clustered,
	DiaChi nvarchar(255),
	KhaiSinhChuHo varchar(10) references KhaiSinh(MaKS),
	TrangThai int
)
insert into HoKhau (DiaChi, KhaiSinhChuHo, TrangThai)
values (N'123 đường Lê Văn Duyệt, Phường 5, thành phố TP. Hồ Chí Minh, tỉnh TP. Hồ Chí Minh, Việt Nam', 'KS01', 1),
		(N'67, đường Lý Thái Tổ, phường Trần Phú, thành phố Nha Trang, tỉnh Khánh Hòa, Việt Nam', 'KS05', 1)
		,(N'5/6/5 Lê Văn Chí, Phường Linh Trung, TP Thủ Đức, tỉnh TP. Hồ Chí Minh, Việt Nam', 'KS08', 1),
		(N'26, đường Lê Văn Việt, phường Trần Phú, thành phố Nha Trang, tỉnh Khánh Hòa, Việt Nam', 'KS017', 1)
		,(N'605 An Thiện, Phường Linh Xuân, thành phố Thủ Đức, tỉnh TP. Hồ Chí Minh, Việt Nam', 'KS020', 1),
		(N'80, đường Lý Thái Tổ, phường Trần Phú, thành phố Nha Trang, tỉnh Khánh Hòa, Việt Nam', 'KS021', 1)

create table QuanHe
(
	MaHK varchar(10) references HoKhau(MaHK),
	KhaiSinhNguoiThamGia varchar(10) references KhaiSinh(MaKS),
	QuanHeVoiChuHo nvarchar(50),
	TrangThai int,
	Primary Key (MaHK, KhaiSinhNguoiThamGia)
)
insert into QuanHe (MaHK, KhaiSinhNguoiThamGia, QuanHeVoiChuHo, TrangThai)
values ('HK01', 'KS01', N'Chủ hộ', 1),
		('HK01', 'KS02', N'Vợ', 1),
		('HK01', 'KS03', N'Con gái', 1),
		('HK01', 'KS04', N'Con trai', 1),
		('HK02', 'KS05', N'Chủ hộ', 1),
		('HK02', 'KS06', N'Vợ', 0),
		('HK02', 'KS07', N'Con trai', 1)
create table DangNhap
(
	Quyen char(20),
	TenDangNhap nvarchar(20) primary key,
	MatKhau char(20),
	TrangThai int
)
insert into DangNhap (Quyen, TenDangNhap, MatKhau, TrangThai)
values ('admin', 'admin12345', '12345',1)
	 ,('user', '083303008061','phamt123',1)
	 ,('user','083303008072', 'kimh123',1)
	 ,('user','083303008211', 'phuongn123',1)
	 ,('user','083303008161', 'nhatt123', 1)
	 ,('user','083303002561', 'hoangl123', 1)
	 ,('user','083303003061','thuyd123', 0)	
	 ,('user','083303008761', 'minhd123', 1)
create table GiayChungTu
(
	ID integer identity(1,1) not null constraint Mct_ID unique,
	MaCT as right('CT0' + cast(ID as varchar(10)),10) persisted constraint PK_MCT primary key clustered,
	CCCD nvarchar(20) references CongDan(CCCD),
	NgayMat date,
	NoiMat nvarchar(100),
	NguyenNhan nvarchar(100),
	TrangThai int
)

insert into GiayChungTu(CCCD, NgayMat, NoiMat, NguyenNhan, TrangThai)
values ('083303003061', '2023-04-01', N'TP HCM', N'Benh tim', 1)
insert into GiayChungTu(CCCD, NgayMat, NoiMat, NguyenNhan, TrangThai)
values ('083303001234', '2023-10-01', N'Hà Nội', N'Benh ung thu', 1)
create table DanhGia 
(	
	CCCD nvarchar(20) references CongDan(CCCD),
	DanhGia nvarchar(200),
	Tongquan int,
	Thuantien int,
	Dedang int,
	Chinhxac int,
	Trucquan int
)

insert into DanhGia values ('083303008072', N'OK', '4', '3', '5', '3', '2')

--select * from Thue
