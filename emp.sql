-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.2.25-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for employee
CREATE DATABASE IF NOT EXISTS `employee` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `employee`;

-- Dumping structure for table employee.dept
CREATE TABLE IF NOT EXISTS `dept` (
  `deptno` int(11) NOT NULL,
  `dname` varchar(30) NOT NULL DEFAULT '',
  `loc` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table employee.dept: ~0 rows (approximately)
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` (`deptno`, `dname`, `loc`) VALUES
	(10, 'ACCOUNTING ', 'NEW YORK'),
	(20, 'RESEARCH ', 'DALLAS '),
	(30, 'SALES ', 'CHICAGO'),
	(40, 'OPERATIONS', 'BOSTON ');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;

-- Dumping structure for table employee.emp
CREATE TABLE IF NOT EXISTS `emp` (
  `empno` int(5) NOT NULL,
  `ename` varchar(30) NOT NULL DEFAULT '',
  `job` varchar(30) DEFAULT NULL,
  `mgr` varchar(30) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` int(11) DEFAULT NULL,
  `comm` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table employee.emp: ~9 rows (approximately)
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` (`empno`, `ename`, `job`, `mgr`, `hiredate`, `sal`, `comm`, `deptno`) VALUES
	(7369, 'SMITH', 'CLERK', '7902', '1980-12-17', 800, NULL, 20),
	(7499, 'ALLEN', 'SALESMAN', '7698', '1981-02-20', 1600, 300, 30),
	(7521, 'WARD', 'SALESMAN', '7698', '1981-02-22', 1250, 500, 30),
	(7566, 'JONES', 'MANAGER', '7839', '1981-04-02', 2975, NULL, 20),
	(7654, 'MARTIN', 'SALESMAN', '7698', '1981-09-28', 1250, 1400, 30),
	(7698, 'BLAKE', 'MANAGER', '7839', '1981-05-01', 2850, NULL, 30),
	(7782, 'CLARK', 'MANAGER', '7839', '1981-06-09', 2450, NULL, 10),
	(7788, 'SCOTT', 'ANALYST', '7566', '1987-04-19', 3000, NULL, 20),
	(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
	(7844, 'TURNER', 'SALESMAN', '7698 ', '1981-09-08', 1500, 0, 30),
	(7876, 'ADAMS', 'CLERK', '7788', '1987-05-23', 1100, NULL, 20),
	(7900, 'JAMES', 'CLERK', '7698\r\n', '1981-12-03', 950, NULL, 30),
	(7902, 'FORD', 'ANALYST', '7566', '1981-12-03', 3000, NULL, 20),
	(7934, 'MILLER', 'CLERK', '7782', '1982-01-23', 1300, NULL, 10);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
