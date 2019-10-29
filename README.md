∆# Solutions

## Exercice 1 (Average)

```java
int sum = 0;
for (int number : numbers) {
    sum += number;
}
return sum / numbers.length;
```

## Exercice 2 (Minimum)

```java
int result = numbers[0];
for (int number : numbers) {
    if (number < result) {
        result = number;
    }
}       
return result;
```

## Exercice 3 (Maximum)

```java
int result = numbers[0];
for (int number : numbers) {
    if (number > result) {
        result = number;
    }
}
return result;
``` 

## Exercice 4 (Sum)

```java
int result = 0;
for (int number : numbers) {
    result += number;
}
// implement logic here
return result;
```