# Opérateurs en Java
Opérateur en Java est un symbole qui est utilisé pour effectuer des opérations. Par exemple : +, -, *, / etc.
Il existe de nombreux types d’opérateurs en Java qui sont donnés ci-dessous :

## 1. Opérateurs Arithmétiques :

- **`+` (Addition) :** Ajoute deux valeurs.
- **`-` (Soustraction) :** Soustrait le deuxième opérande du premier.
- **`*` (Multiplication) :** Multiplie deux valeurs.
- **`/` (Division) :** Divise le premier opérande par le deuxième.
- **`%` (Modulo) :** Renvoie le reste de la division du premier opérande par le deuxième.

## 2. Opérateurs Relationnels :

- **`==` (Égal à) :** Vérifie si deux valeurs sont égales.
- **`!=` (Différent de) :** Vérifie si deux valeurs ne sont pas égales.
- **`>` (Supérieur à) :** Vérifie si le premier opérande est supérieur au deuxième.
- **`<` (Inférieur à) :** Vérifie si le premier opérande est inférieur au deuxième.
- **`>=` (Supérieur ou égal à) :** Vérifie si le premier opérande est supérieur ou égal au deuxième.
- **`<=` (Inférieur ou égal à) :** Vérifie si le premier opérande est inférieur ou égal au deuxième.

## 3. Opérateurs Logiques :

- **`&&` (ET logique) :** Renvoie `true` si les deux opérandes sont `true`.
- **`||` (OU logique) :** Renvoie `true` si au moins l'un des opérandes est `true`.
- **`!` (NON logique) :** Renvoie `true` si l'opérande est `false`, et `false` si l'opérande est `true`.

## 4. Opérateurs d'Assignation :

- **`=` (Assignation) :** Affecte la valeur de l'opérande de droite à la variable de gauche.
- **`+=`, `-=`, `*=`, `/=`, `%=` (Assignation combinée) :** Effectue l'opération correspondante et affecte le résultat à l'opérande de gauche.

## 5. Opérateurs d'Incrémentation et de Décrémentation :

- **`++` (Incrémentation) :** Augmente la valeur de l'opérande de 1.
- **`--` (Décrémentation) :** Diminue la valeur de l'opérande de 1.

## 6. Opérateur Conditionnel (Ternaire) :

- **`? :` (Opérateur conditionnel) :** Évalue une expression booléenne et renvoie l'une de deux valeurs en fonction du résultat.

## 7. Opérateurs Bit à Bit :

- **`&` (ET bit à bit) :** Effectue un ET bit à bit.
- **`|` (OU bit à bit) :** Effectue un OU bit à bit.
- **`^` (OU exclusif bit à bit) :** Effectue un OU exclusif bit à bit.
- **`~` (Complément à un bit à bit) :** Inverse les bits de son opérande.
- **`<<` (Décalage à gauche) :** Décale les bits de l'opérande de gauche vers la gauche d'un nombre spécifié de positions.
- **`>>` (Décalage à droite) :** Décale les bits de l'opérande de gauche vers la droite d'un nombre spécifié de positions.
- **`>>>` (Décalage à droite non signé) :** Décale les bits de l'opérande de gauche vers la droite d'un nombre spécifié de positions, en remplissant les bits de gauche avec des zéros.

Ces opérateurs sont essentiels pour effectuer diverses opérations en programmation Java.

Voici un exemple dans lequel je couvre différents types d'opérateurs en Java, y compris les opérateurs arithmétiques, relationnels, logiques, d'assignation, et conditionnels.
```
// Programme Java illustrant différents types d'opérateurs
import java.util.Scanner;

// Classe principale
class Main {
    // Fonction principale
    public static void main(String[] args) {
        // Opérateurs arithmétiques
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Opérateurs relationnels
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Opérateurs logiques
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // Opérateurs d'assignation
        int c = 5;
        c += 2;
        System.out.println("Valeur de c après c += 2 : " + c);

        // Opérateur conditionnel (Ternaire)
        int number = 15;
        String result = (number % 2 == 0) ? "Pair" : "Impair";
        System.out.println("Le nombre est : " + result);

        // Fermeture du scanner
        scanner.close();
    }
}

```
### Sortie Attendue :
- * a + b = 13
- * a - b = 7
- * a * b = 30
- * a / b = 3
- * a % b = 1
- * a == b : false
- * a != b : true
- * a > b : true
- * a < b : false
- * a >= b : true
- * a <= b : false
- * x && y : false
- * x || y : true
- * !x : false
- * Valeur de c après c += 2 : 7
- * Le nombre est : Impair


