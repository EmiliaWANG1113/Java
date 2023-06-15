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

## 將字串中的a替換成b(replace(CharSequence a, CharSequence b))

```java
String str = “abcd”;
str.replace(“a”,”b”);
```

## 正規表⽰法(Regular Expression)
* 使⽤單個字串來描述、符合⼀系列某個句法規則的字串
* java.util.regex.Pattern

```java
\d
String reg = “1234”;
[a-zA-Z]
String str = “abcABC”;
```

## 使⽤正規表⽰法替換掉所有的字串(replaceAll(String regex, String replacement))

```java
String str = “abc123”;
str.replaceAll(“\
\d”,”def”);
```

## 判斷字串是否相等(equals)

```java
String str1 = “abc”;
String str1 = “def”;

System.out.println(str1.equals(str2));
```

