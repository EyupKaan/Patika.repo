1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
```sql
CREATE TABLE Employee (
	ID INT,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
)
```
---
2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
```sql
insert into employee (id, name, birthday, email) values (92, 'Barbe', '1901/02/16', 'bfairfoull0@desdev.cn');
insert into employee (id, name, birthday, email) values (47, 'Sutton', '1981/09/20', 'smcfall1@dot.gov');
insert into employee (id, name, birthday, email) values (85, 'Barb', '1976/11/17', 'bbeverage2@google.fr');
insert into employee (id, name, birthday, email) values (64, 'Perle', '1920/12/12', 'peasterby3@eepurl.com');
insert into employee (id, name, birthday, email) values (2, 'Laina', '1956/06/28', 'lblaydon4@google.com.br');
insert into employee (id, name, birthday, email) values (62, 'Bent', '1907/06/01', 'bryhorovich5@kickstarter.com');
insert into employee (id, name, birthday, email) values (94, 'Geno', '2015/05/12', 'gmindenhall6@xinhuanet.com');
insert into employee (id, name, birthday, email) values (86, 'Karen', '2013/01/24', 'kmonketon7@seesaa.net');
insert into employee (id, name, birthday, email) values (56, 'Roch', '1920/11/13', 'rmajor8@amazon.co.uk');
insert into employee (id, name, birthday, email) values (93, 'Alix', '2019/01/11', 'aschellig9@4shared.com');
insert into employee (id, name, birthday, email) values (23, 'Alica', '1959/12/12', 'alovarta@so-net.ne.jp');
insert into employee (id, name, birthday, email) values (62, 'Tuck', '2001/01/15', 'tcornishb@unblog.fr');
insert into employee (id, name, birthday, email) values (21, 'Simon', '1972/02/22', 'sjouanetc@csmonitor.com');
insert into employee (id, name, birthday, email) values (31, 'De witt', '1921/03/10', 'deasbyd@livejournal.com');
insert into employee (id, name, birthday, email) values (27, 'Ricard', '1992/04/22', 'rglanistere@phpbb.com');
insert into employee (id, name, birthday, email) values (74, 'Sascha', '1939/05/27', 'swynrahamef@nasa.gov');
insert into employee (id, name, birthday, email) values (29, 'Clayborn', '1935/06/10', 'cvinag@1688.com');
insert into employee (id, name, birthday, email) values (39, 'Jo', '2010/10/25', 'jbertomieuh@canalblog.com');
insert into employee (id, name, birthday, email) values (34, 'Wendie', '1939/09/22', 'wferrari@oaic.gov.au');
insert into employee (id, name, birthday, email) values (69, 'Ardenia', '1978/08/15', 'ahunterj@va.gov');
insert into employee (id, name, birthday, email) values (32, 'Isobel', '1927/03/10', 'icrosskellk@privacy.gov.au');
insert into employee (id, name, birthday, email) values (67, 'Danell', '1966/11/06', 'dmounceyl@dot.gov');
insert into employee (id, name, birthday, email) values (52, 'Augie', '1914/02/22', 'akenninghamm@gravatar.com');
insert into employee (id, name, birthday, email) values (94, 'Kippy', '1975/11/13', 'kcurrelln@drupal.org');
insert into employee (id, name, birthday, email) values (36, 'Andreana', '1906/11/02', 'ablaiko@nbcnews.com');
insert into employee (id, name, birthday, email) values (29, 'Phip', '1963/05/08', 'pgratrixp@canalblog.com');
insert into employee (id, name, birthday, email) values (94, 'Lorrayne', '1943/08/02', 'lpatershallq@joomla.org');
insert into employee (id, name, birthday, email) values (41, 'Enrica', '1914/06/10', 'eettyr@paypal.com');
insert into employee (id, name, birthday, email) values (28, 'Kellsie', '1955/01/29', 'knutbeems@reverbnation.com');
insert into employee (id, name, birthday, email) values (63, 'Teddy', '1917/04/07', 'tcowlest@weibo.com');
insert into employee (id, name, birthday, email) values (84, 'Inger', '1949/11/19', 'idoaleu@yandex.ru');
insert into employee (id, name, birthday, email) values (2, 'Dee dee', '1936/05/05', 'dgreggsv@opera.com');
insert into employee (id, name, birthday, email) values (45, 'Danika', '1952/10/10', 'dkettonw@mlb.com');
insert into employee (id, name, birthday, email) values (35, 'Lazare', '1917/12/12', 'leddiesx@nih.gov');
insert into employee (id, name, birthday, email) values (67, 'Alford', '1979/09/19', 'adoriey@shinystat.com');
insert into employee (id, name, birthday, email) values (80, 'La verne', '2007/01/15', 'lbuckthoughtz@bbb.org');
insert into employee (id, name, birthday, email) values (9, 'Ezekiel', '1957/06/27', 'eodempsey10@chicagotribune.com');
insert into employee (id, name, birthday, email) values (57, 'Nadeen', '1971/10/30', 'nlowthian11@dedecms.com');
insert into employee (id, name, birthday, email) values (29, 'Carma', '1989/12/13', 'ccaird12@mtv.com');
insert into employee (id, name, birthday, email) values (60, 'Vinson', '1977/07/17', 'vbrinkworth13@webmd.com');
insert into employee (id, name, birthday, email) values (93, 'Fiona', '1920/02/16', 'fboles14@google.co.uk');
insert into employee (id, name, birthday, email) values (96, 'Adria', '1953/06/24', 'aknightley15@last.fm');
insert into employee (id, name, birthday, email) values (1, 'Marget', '1967/07/15', 'maven16@soup.io');
insert into employee (id, name, birthday, email) values (30, 'Niven', '1943/08/15', 'nsydry17@wunderground.com');
insert into employee (id, name, birthday, email) values (36, 'See', '1981/01/13', 'scurwen18@fotki.com');
insert into employee (id, name, birthday, email) values (66, 'Catriona', '1970/08/01', 'cquarless19@wordpress.org');
insert into employee (id, name, birthday, email) values (94, 'Giulio', '1924/12/26', 'gmathevet1a@ifeng.com');
insert into employee (id, name, birthday, email) values (89, 'Cleve', '2008/03/16', 'cmetzing1b@prweb.com');
insert into employee (id, name, birthday, email) values (81, 'Terri', '1926/11/27', 'tbollom1c@go.com');
insert into employee (id, name, birthday, email) values (93, 'Jake', '2019/05/21', 'jhuortic1d@wordpress.org');
```
---
3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
```sql
UPDATE employee SET name = 'Margeret' WHERE id = 1;
UPDATE employee SET email = 'deedee@gmail.com' WHERE email = 'dgreggsv@opera.com';
UPDATE employee SET birthday = '1973/05/17' WHERE id = 1;
UPDATE employee SET name = 'Rosier', birthday = '1903/03/19' WHERE email = 'ccaird12@mtv.com';
UPDATE employee SET birthday = '1990/09/09', email = 'ninety_ninenine@yahoo.com' WHERE id = 3;
```
---
4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
```sql
DELETE FROM employee WHERE name = 'Dee Dee';
DELETE FROM employee WHERE id = 1;
DELETE FROM employee WHERE birthday = '1926/11/27';
DELETE FROM employee WHERE email = 'ccaird12@mtv.com';
DELETE FROM employee WHERE id = 29;
```
---
