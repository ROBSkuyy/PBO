# e-COMMERCE

### I Made Roby Dwimartha
2205551096

## About
Program ini bertujuan untuk membuat backend API untuk aplikasi e-commerce sederhana yang nantinya memberikan response dengan format JSON. Adapun request method pada API memuat: <br/>
**GET** untuk mendapatkan list atau detail data dari entitas. <br/>
**POST** untuk membuat data entitas baru. <br/>
**PUT** untuk mengubah data dari entitas. <br/>
**DELETE** untuk menghapus data dari entitas. <br/>

Data-data yang digunakan dalam aplikasi e-Commerce ini akan disimpan pada **database SQLite** yang kemudian akan dilakukan suatu pengujian API yang telah diprogram melalui aplikasi **Postman**

## Spesifikasi API dalam Aplikasi e-Commerce 
### **GET**

- GET /users untuk mendapatkan daftar semua user yang termuat di dalam database. <br/>
localhost:8096/users

```
{
    "User Information": [
        {
            "First_Name": "roby",
            "Type": "seller",
            "Email": "roby@gmail.com",
            "Last_Name": "dwi",
            "id_user": 101,
            "Phone Number": "081236456789"
        },
        {
            "First_Name": "candra",
            "Type": "seller",
            "Email": "candra@gmail.com",
            "Last_Name": "wijaya",
            "id_user": 102,
            "Phone Number": "087762445678"
        },
        {
            "First_Name": "rama",
            "Type": "buyer",
            "Email": "pogot@gmai.com",
            "Last_Name": "putra",
            "id_user": 103,
            "Phone Number": "081936557876"
        },
        {
            "First_Name": "de",
            "Type": "buyer",
            "Email": "dejoh@gmail.com",
            "Last_Name": "joh",
            "id_user": 104,
            "Phone Number": "088115116117"
        },
        {
            "First_Name": "made",
            "Type": "seller",
            "Email": "mage@gmail.com",
            "Last_Name": "gede",
            "id_user": 105,
            "Phone Number": "098776557687"
        }
    ]
}
```

<br/>

- GET /users/{id} untuk mendapatkan informasi user dan alamatnya. <br/>
localhost:8096/users/101 

```
{
    "User Information": [
        {
            "First_Name": "roby",
            "Type": "seller",
            "Email": "roby@gmail.com",
            "Last_Name": "dwi",
            "Id": 101,
            "City": "Karangasem",
            "Phone Number": "081236456789",
            "Postcode": "8016",
            "Province": "Bali"
        }
    ]
}
```

<br/>

- GET /users/{id}/products untuk mendapatkan daftar produk milik user. <br/>
localhost:8096/users/103/products

```{
    "Products Information": [
        {
            "User ID": 103,
            "Nama": "rama",
            "Harga": 2,
            "Deskripsi": "Mengandung Vitamin C",
            "ID Barang": 1,
            "Nama Produk": "UC 1000",
            "Stock": 100
        }
    ]
}
```

<br/>

- GET /users/{id}/orders untuk mendapatkan daftar order milik user. <br/>
localhost:8096/users/104\/orders

```
{
    "Order Information": [
        {
            "Order": 2,
            "Nama": "de",
            "Total": 3,
            "Diskon": 0,
            "id user": 104
        }
    ]
}
```
<br/>

- GET /users/{id}/reviews untuk mendapatkan daftar review yang dibuat oleh user. <br/>
localhost:8096/users/104/reviews

```
{
    "Reviews Information": [
        {
            "User": 104,
            "star": 4,
            "First Name": "de",
            "Deskripsi": "Cokelatnya meleleh dimulut",
            "Last Name": "joh",
            "order": 2
        }
    ]
}
```

<br/>

- GET /orders/{id} untuk mendapatkan informasi order, buyer, detail order, review, product title, beserta pricenya. <br/>
localhost:8096/orders/1  

```
{
    "Orders Information": [
        {
            "idUser": 103,
            "idOrder": 1,
            "Description": "Vitamin Cnya bikin tubuh makin seger",
            "Price": "2500",
            "Star": 5,
            "Note": 1,
            "idProduct": 1,
            "Quantity": 2,
            "Title": "UC 1000",
            "Name": "rama"
        }
    ]
}
```

<br/>

- GET /products untuk mendapatkan daftar semua produk. <br/>
localhost:8096/products

```
{
    "Product Information": [
        {
            "Description": "Mengandung Vitamin C",
            "User": 103,
            "Price": "2.500",
            "Title": "UC 1000",
            "Id": 1,
            "Stock": 100
        },
        {
            "Description": "Berlapis kacang",
            "User": 104,
            "Price": "2.500",
            "Title": "Silverqueen",
            "Id": 2,
            "Stock": 150
        }
    ]
}
```

<br/>

- GET /products/{id} untuk mendapatkan informasi produk dan seller. <br/>
localhost:8096/products/101

```
{
    "Product Information": [
        {
            "First_Name": "roby",
            "Type": "seller",
            "Description": "Mengandung Vitamin C",
            "Email": "roby@gmail.com",
            "Price": "2.500",
            "Last_Name": "dwi",
            "Title": "UC 1000",
            "Seller": 101,
            "Id": 1,
            "id_user": 101,
            "Phone Number": "081236456789",
            "Stock": 100
        }
    ]
}
```


<br/>

### **POST**
- Membuat data baru ke dalam aplikasi <br/>
https://localhost:8096/products

```
{
    "id_product":"3",
    "id_user":"105",
    "title":"Cadburry",
    "description":"Lumer di mulut",
    "price":"5000",
    "stock":"50"
}   
```



### **PUT**
- Mengubah data yang ada dimana saya mencoba untuk mengubah data pada tabel user <br/>
 https://localhost:8096/users/101

```
{
    "id_user":"101",
    "first_name": "roby",
    "last_name": "dwi",
    "email": "roby@gmail.com",
    "phone_number": "081236456789",
    "type" : "seller"
}
```

<br/>

### **DELETE**
- Menghapus data dari entitas tertentu dimana saya mencoba untuk menghapus data yang terdapat pada tabel users <br/>
https://localhost:8096/users/102


<br/>