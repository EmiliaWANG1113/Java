# Variable

| 型態類型      | 關鍵字 | 位元數 | 範圍 |
| ----------- | ----------- |----------- |----------- |
| 位元組   | byte  |  8  | -128 ～ 127  |
| 整數   | short  |  16  | -32768 ～ 32767 |
| 整數   | int  |  32  | -2147483648 ～ 2147483647  |
| 整數   | long  |  64  | -9223372036854775808 ～ 9223372036854775807  |



| 型態類型      | 關鍵字 | 位元數 |
| ----------- | ----------- |----------- |
| 浮點數   | float  |  32  | 
| 浮點數   | double  |  64  | 
| 字元   | char  |  16  | 
| 布林值   | boolean  |  1  | 



| 基本資料型態      | 類別 |
| ----------- | ----------- |
| byte   | Byte  |
| short   | Short  | 
| int   | Integer  |
| long   | Long  | 
| float    | Float  |
| double   | Double  | 
| char   | Character  |
| boolean   | Boolean  | 

## Overflow 溢值
* 儲存值超過型態的範圍


## 資料型態轉變
* 基本資料型態之間轉換
* 使⽤⼩括弧和變數型態

```java
int i = 10;
long l = (long)i;
```

## 包裹型態（Wrapper Types）
* 將基本資料型態包裝成物件

```java
Double d = new Double(3.14);
```

## 物件之間轉換
* 將基本資料型態轉換為物件

```java
double d1 = 3.14;
Double d2 = Double.valueOf(d1);
```


## ⾃動裝箱(autoboxing, unboxing)
* 編譯器⾃動將基本資料型態轉換為物件

```java
//autoboxing
double d1 = 3.14;
Double d2 = d1;

//unboxing
Double d2 = new Double(3.14);
double d1 = d2;
```
