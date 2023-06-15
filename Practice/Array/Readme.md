# Array
* 陣列像抽屜⼀格⼀格存放資料
* 陣列是物件,可指定陣列長度

```java
int[] num = new int[3];
num[0] = 1;
num[1] = 2;
```


# 多維陣列

```java
int[][] = new int[3][3];
int[0][0] = 1;
int[0][1] = 2;
int[0][2] = 3;
 ………
int[2][0] = 7;
int[2][1] = 8;
int[2][2] = 9;
```

# 陣列複製
* Arrays.copyOf()
```java
int[] num1 = new int[]{1,2};
int[] num2 = Arrays.copyOf(num1, 2);
```
