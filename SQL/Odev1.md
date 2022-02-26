1. Film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınınz 

``` 
SELECT title, description FROM film

```
---

2. Film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.

```
SELECT * FROM film 
WHERE
film.length > 60 AND film.length < 75
```
---
3. Film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.
```
SELECT * FROM film 
WHERE
film.rental_rate = 0.99 AND (film.replacement_cost = 12.99 OR film.replacement_cost = 28.99)
```
---
4. Customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?
```
SELECT first_name, last_name FROM customer 
WHERE
first_name = 'Mary'
```
---
5. Film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.
```
SELECT * FROM film 
WHERE
film.rental_rate != 2.99 AND film.rental_rate != 4.99 AND film.length <= 50
```
---

