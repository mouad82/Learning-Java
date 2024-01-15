## 4.Java Variables
Une variable est un conteneur qui contient la valeur pendant l’exécution du programme Java. Une variable est affectée avec un type de données.
Variable est un nom d’emplacement de mémoire. Il existe trois types de variables en java : local, instance et statique.
Il existe deux types de données en Java : primitif et non primaire.
### Déclarer les variables en Java
En Java, vous pouvez déclarer des variables pour stocker et manipuler des données.
On peut facilement percevoir qu’en déclarant une variable, nous devons nous occuper de deux choses :

![variables](https://www.guru99.com/images/uploads/2012/07/VriableTypeNameDeclaration.jpg)

1. datatype : Type de données pouvant être stockées dans cette variable. 
1. name : Nom donné à la variable. 
De cette façon, un nom ne peut être donné qu’à un emplacement de mémoire. On peut lui attribuer des valeurs de deux façons : 
* Initialisation des variables
* Attribution de valeur en prenant des entrées
### initialiser des variables en Java 
Il peut être perçu à l’aide de 3 composantes qui sont les suivantes :
1. **Type de données :** Type de données pouvant être stockées dans cette variable.
1. **variable_name :** Nom donné à la variable.
1. **value :** C’est la valeur initiale stockée dans la variable.
### Les règles et conventions de nommage
1. Un nom de variable peut être composé de lettres majuscules A-Z, de lettres minuscules a-z chiffres 0-9, et de deux caractères spéciaux tels que _ underscore et $ dollar signe.
1. Le premier caractère ne doit pas être un chiffre.
1. Les espaces vides ne peuvent pas être utilisés dans les noms de variables.
1. Les mots-clés Java ne peuvent pas être utilisés comme noms de variables.
1. Les noms de variables sont sensibles à la casse.
1. Il n’y a pas de limite sur la longueur d’un nom de variable, mais par convention, il devrait être entre 4 à 15 caractères.
1. Les noms de variables doivent toujours exister sur le côté gauche des opérateurs d’affectation.
### Types de variables
There are three types of variables in Java:
* local variable
* instance variable
* static variable
#### local variable
Une variable locale est une variable qui est déclarée dans une méthode, un constructeur ou un bloc, et qui n’est visible et accessible que dans ce périmètre. Cela signifie que vous ne pouvez pas accéder à une variable locale en dehors de la méthode, du constructeur ou du bloc dans lequel elle est déclarée.
Les variables locales sont créées lorsque la méthode, le constructeur ou le bloc est entré et sont détruites lorsqu’elles sont sorties. Cela signifie que leurs valeurs n’existent que pour la durée de la méthode, du constructeur ou du bloc. Les variables locales doivent être initialisées avant de pouvoir être utilisées en Java.
Les variables locales peuvent avoir n’importe quel type primitif ou de référence en Java, et peuvent être modifiées dans la méthode, le constructeur ou le bloc où elles sont déclarées.
#### instance variable
Une variable d’instance, également appelée variable membre, est une variable déclarée dans une classe, mais en dehors de toute méthode, constructeur ou bloc. Les variables d’instance appartiennent à l’instance de la classe et sont donc uniques à chaque instance.
Les variables d’instance peuvent avoir n’importe quel type primitif ou de référence en Java, et peuvent être modifiées en utilisant des méthodes définies dans la classe. Ils peuvent être consultés en utilisant une instance de la classe, et leurs valeurs persistent tant que l’instance existe. Cela signifie que les variables d’instance peuvent être utilisées pour maintenir les informations d’état des objets de la classe.
#### static variable
une variable statique est une variable qui appartient à une classe plutôt qu’à une instance de la classe. Les variables statiques sont également appelées variables de classe car leurs valeurs sont partagées entre toutes les instances de la classe.
Les variables statiques sont déclarées à l’aide du mot-clé static et sont généralement utilisées pour stocker des valeurs communes à toutes les instances d’une classe, telles que des constantes ou des valeurs de configuration. Étant donné que les variables statiques appartiennent à la classe elle-même, elles peuvent être consultées en utilisant le nom de la classe, plutôt qu’une instance de la classe.
### Exemple pour comprendre les types de variables en java
```
public class A  
{  
    static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable    
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable    
    }  
}//end of class

```
## Data Types Java
Les types de données spécifient les différentes tailles et valeurs qui peuvent être stockées dans la variable. Il existe deux types de types de données en Java :
1. **Primitive data types:** Les types de données primitifs incluent booléen, char, byte, short, int, long, float et double.
2. **Non-primitive data types :** Les types de données non primaires comprennent les classes, les interfaces et les tableaux.

![data-types](https://www.softwaretestingmaterial.com/wp-content/uploads/2018/03/Data-Types.png)

### Primitive data types:
Il existe 8 types de données primitifs tels que byte, short, int, long, float, double, char et boolean. La taille de ces 8 types de données primitifs ne changera pas d’un système d’exploitation à un autre

|Type|Default|Size|Range of values|     
|----|-----|-------|--------------|      
|boolean|false|1 bit|true, false|
|byte|0|8 bits|-128 to 127|
|char|\u0000|16 bits|characters representation of ASCII values 0 to 255|
|short|0|16 bits|-32,768 to 32,767|
|int|0|32 bits|-2,147,483,648 to 2,147,483,647|
|long|0|64 bits|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float|0.0|32 bits|upto 7 decimal digits|
|double|0.0|64 bits|upto 16 decimal digits|

### Non-Primitive data types:
Primitive data types comprennent les classes, les interfaces et les tableaux ...
### Taille et plage :
La taille et la plage des types de données primitifs sont indépendantes de la machine et définies par la spécification Java Virtual Machine (JVM).
### Conversion du type :
Java prend en charge deux types de conversion : la conversion automatique de type (widening) et la conversion explicite de type (casting). Par exemple :
```
int intValue = 42;
double doubleValue = intValue; // Automatic (widening) conversion

double doubleValue = 42.0;
int intValue = (int) doubleValue; // Explicit (casting) conversion

```