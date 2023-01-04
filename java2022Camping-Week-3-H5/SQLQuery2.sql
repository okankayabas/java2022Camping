--Select
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
Select * from Products where CategoryID=1 or CategoryID=3

Select * from Products where CategoryID=1 and UnitPrice>=10

Select * from Products where CategoryID=1 order by UnitPrice desc  --ascending --descending

select count (*) Adet from Products -- kaç satır veri var : count

select CategoryID,count(*) from Products group by CategoryID -- kategoride kaç ürün vardır sorgusu

select CategoryID,count(*) from Products where UnitPrice>20 group by CategoryID having COUNT(*)<10

select Products.ProductID, Products.ProductID, Products.UnitPrice, Categories.CategoryName from products inner join Categories on Products.CategoryID = Categories.CategoryID where Products.UnitPrice>10
--DTO data transformation object

select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID

select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null
--siparişi olmayan müşterileri filtrelediğimiz sorgular




