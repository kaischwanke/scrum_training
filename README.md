∆# Solutions

## Exercice 1

```java
int sum = 0;
for (int number : numbers) {
    sum += number;
}
return sum / numbers.length;
```

## Exercice 2

```java
int result = numbers[0];
for (int number : numbers) {
    if (number < result) {
        result = number;
    }
}       
return result;
```

## Exercice 3

```java
int result = numbers[0];
for (int number : numbers) {
    if (number > result) {
        result = number;
    }
}
return result;
``` 

