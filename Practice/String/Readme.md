# String

## 處理字串常⽤的⽅法(split)
* 將字串分割為數個字串
* 回傳值為字串陣列

```java
String str = “test1, test2, test3”;
String[] sArray = str.split(“,”);
```

## 處理字串常⽤的⽅法(substring)
* 依據指定的位置取回⼦字串

```java
String str = “abcdef”;
str.substring(0,4);
```

## 回傳第⼀個⼦字串的索引值(indexOf(String str))
* 依據指定的位置取回⼦字串

```java
String str = “aaaaa”;
indexOf(“a”);
```

## 回傳最後⼀個⼦字串的索引值(lastIndexOf(String str))
* 依據指定的位置取回⼦字串

```java
String str = “aaaaa”;
lastIndexOf(“a”);
```

## 是否包含某⼀個字串(contains(CharSequence s))

```java
String str = “abcde”;
str.contains(“c”);
```
