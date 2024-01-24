PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE `admin` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `nama_admin` TEXT,
  `username` TEXT,
  `password` TEXT
);
INSERT INTO admin VALUES(1,'Roynaldi','roy','roy123');
INSERT INTO admin VALUES(2,'Syefulloh S.','ipul','ipul123');
INSERT INTO admin VALUES(3,'Vella Anggraeni Setyaningsih','vella','vella123');
CREATE TABLE `buku` (
  `id_buku` TEXT PRIMARY KEY,
  `judul` TEXT,
  `pengarang` TEXT,
  `penerbit` TEXT,
  `kategori` TEXT,
  `deskripsi` TEXT,
  `stok` INTEGER
);
INSERT INTO buku VALUES('B0001','Flutter Untuk Pemula','Roynaldi','Lokomedia','Pemrograman','flutter dibangun dengan dart,dijuluki sebagai framework superpower karena kemampuannya untuk membuat aplikasi lintas platform hanya dalam satu basis kode',8);
INSERT INTO buku VALUES('B0002','Bumi Manusia','Pramoedya AT','Moon Seed Publisher','Pelajaran','Bumi manusia,manusia?',15);
INSERT INTO buku VALUES('B0003','Laskar Pelangi','Andrea Hirata','Gramedia','Novel','Ok',24);
INSERT INTO buku VALUES('B0004','Sunset','Dae Mahanta','Moon Seed Publisher','Novel','Lorem ipsum 1233',20);
CREATE TABLE `mahasiswa` (
  `nim` TEXT PRIMARY KEY,
  `name` TEXT,
  `prodi` TEXT
);
INSERT INTO mahasiswa VALUES('SSI202203085','Vella Anggraeni','S1 Informatika');
INSERT INTO mahasiswa VALUES('SSI202203088','Roynaldi','S1 Sistem Informasi');
INSERT INTO mahasiswa VALUES('SSI202203170','Syefulloh.S','S1 Teknik Informatika');
CREATE TABLE `pinjaman` (
  `id_pinjam` TEXT PRIMARY KEY,
  `nim` TEXT,
  `nama` TEXT,
  `id_buku` TEXT,
  `judul` TEXT,
  `jumlah` INTEGER,
  `tgl_pinjam` TEXT,
  `tgl_balik` TEXT,
  `denda` INTEGER,
  `status` TEXT
);
INSERT INTO pinjaman VALUES('P0001','SSI202203088','Roynaldi','B0001','Flutter Untuk Pemula',2,'22 January 2024','23 January 2024',5000,'Sudah Kembali');
INSERT INTO pinjaman VALUES('P0002','SSI202203085','Vella Anggraeni','B0002','Bumi Manusia',10,'23 January 2024','23 January 2024',0,'Sudah Kembali');
INSERT INTO pinjaman VALUES('P0003','SSI202203085','Vella Anggraeni','B0004','Sunset',4,'20 January 2024','23 January 2024',40000,'Sudah Kembali');
DELETE FROM sqlite_sequence;
INSERT INTO sqlite_sequence VALUES('admin',3);
COMMIT;
