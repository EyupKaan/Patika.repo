1. actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
```sql
(SELECT first_name, last_name FROM actor
ORDER BY first_name )
UNION
(SELECT first_name, last_name FROM customer
ORDER BY first_name)
```
---
2. actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
```sql
SELECT first_name, last_name FROM actor
INTERSECT
SELECT first_name, last_name FROM customer
```
---
3. actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
```sql
SELECT first_name, last_name FROM actor
EXCEPT
SELECT first_name, last_name FROM customer
```
---
4. İlk 3 sorguyu tekrar eden veriler için de yapalım.
```sql
(SELECT first_name, last_name FROM actor
ORDER BY first_name )
UNION ALL
(SELECT first_name, last_name FROM customer
ORDER BY first_name)
```
```sql
SELECT first_name, last_name FROM actor
INTERSECT ALL
SELECT first_name, last_name FROM customer
```
```sql
SELECT first_name, last_name FROM actor
EXCEPT ALL
SELECT first_name, last_name FROM customer
```
---
