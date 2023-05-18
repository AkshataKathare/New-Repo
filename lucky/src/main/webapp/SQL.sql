create database databaseName;

create table tableName;

create table tableName(
col1 varchar(100)
etc
);

select * from tableName;

-- to select specific columns in table:

select col1,col2 from tableName;

create table newTableName
AS SELECT col1,col2
FROM oldTableName;

ALTER TABLE existingTable ADD newCol datatype;

ALTER TABLE existingTable DROP COLUMN colName;

-- If any spelling mistake in colName then:

ALTER TABLE existingTable RENAME COLUMN wrongColName TO newColName

-- If we want to change the datatype of any col:

ALTER TABLE existingTable MODIFY COLUMN colName newDataType;

-- when we want to insert all the values in the table:

INSERT INTO tableName VALUES(value1,value2....);

-- when we want to put the values in the selected columns:

INSERT INTO tableName(col1,col2..) VALUES(value1,value2,...);

-- Query used so that the duplicate values are not allowed:
-- UNIQUE is a constraint

CREATE TABLE tableName(
age int UNIQUE,
height double
);

-- Query used so that the particular value must not be null:
-- not null is a constraint

ALTER TABLE tableName MODIFY COLUMN age int not null;

-- to fix a default value for any column:
-- default is a constraint

CREATE TABLE tableName (
age int default 21,
location varchar(50) default 'BENGALURU'
);

-- 14-4-2023

-- If we want a data to be not null as well as unique then we use a constraint primary key which is a combo of both:

CREATE TABLE tableName(
col1 datatype not null,
primary key(col1)
);
-- 15-4-2023:-
-- To count no.of rows:

select count(*) from tableName;

-- one table can have only one primary key

-- when we want to select the particular column:

-- where is used to filter the data

select * from database.tableName where col1=name and col2=name;

select col1,col2 from database.tableName where col3=...;

select * from database.tableName where col1=name or col2=name;

select col1,col2 from mobile.poco where anyCol=... or anyOtherCol=...;

-- select the unique data:

select distinct col from database.tableName;

-- when we want to select a particular data where we dont want some specific data:

select * from databas.tableName where not colName=...;

-- we can also drop the primary key just by the tableName:

ALTER TABLE tableName DROP primary key;

-- If we want to update the data in specific table where anyCol=..:

-- 18-04-2023:
UPDATE tableName SET anyCol=.. where otherCol=...;

-- To update the column with same data in all rows of particular column:
UPDATE tableName SET anyColumn=...;

-- Updating two columns by one query:
UPDATE tableName SET anyCol=... where otherCol=... OR anotherCol=...;

-- If we want to delete only one row from the table:
DELETE FROM tableName where colName=...;

-- If we want to delete whole data:
DELETE FROM tableName;

-- If we want to select the minimum value of any column:
SELECT MIN(colName) from tableName;

-- If we want to select the Maximum value of any column:
SELECT MAX(colName) from tableName; or SELECT MAX(colName) from tableName where anyCol=...;

-- If we want to get average of any numbers like percentage,age etc :
SELECT AVG(percentage) from tableName;

-- 22-04-2023:
-- If we want to select the columns if any column consists of data with any specific letter at a specific position :
SELECT colName from tableName where col like '__A%'; -- this gives the names which have 'A' as the third letter and can have letters further

SELECT col1,col2 from tableName where col like '%T';-- this gives data having T at the end only

-- If we want to select the columns if any column consists of data with any specific letters in the beginning and end:
SELECT col1,col2.. from tableName where anyCol like 'M%N';-- this gives the names which starts with M and ends with N

SELECT comm,CASE WHEN comm is null then 'Not given' else 'given' END FROM empl;-- this is to print a specific data for a specific condition in table

-- 24-04-23:
-- If we want to select the table where a column is having a specific value or the other value:
SELECT * from tableName where colName in('...','...',...);  -- 'in' acts as or operator

SELECT * FROM empl WHERE job not in('SALESMAN','MANAGER');-- opposite of above query

-- between clause:
SELECT * FROM empl WHERE sal between 2500 and 4000;
SELECT * FROM empl WHERE sal not between 2500 and 4000;

SELECT comm as commission FROM empl; -- alias name
SELECT comm as commission,sal as salary FROM empl;

-- If we want to remove all the data from the table but we use delete if we want to delete specific columns:
TRUNCATE FROM tableName;

-- DROP or DELETE will affect all the rows as it will delete row by row and Truncate will not affect 
-- all the rows and hence delete will be faster than truncate as it takes 0.000 sec

-- check is a constraint used to put the conditions like:
CREATE TABLE new3(
age int,
check(age>=20)
);

-- For current values:
SELECT current_timestamp() as CurrentDateAndTime;
SELECT current_date() as todayDate;
SELECT current_time() as currentTime;
SELECT current_user() as currentUser;