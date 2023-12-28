# Learning-Java
## 1.Installer le Kit de développement Java (JDK) 
> Pour Windows :
### Télécharger le JDK :
Visitez la page de téléchargement d'Oracle JDK.
Téléchargez le programme d'installation JDK pour Windows.
### Exécuter l'installateur :
Exécutez l'installateur téléchargé et suivez les instructions d'installation.
### Configurer les variables d'environnement Java (facultatif) :
Après l'installation, vous devrez peut-être définir la variable d'environnement JAVA_HOME et ajouter le répertoire bin au chemin d'accès (PATH). Cette étape est souvent effectuée automatiquement par l'installateur.
> Pour macOS :
### Installer Homebrew (facultatif) :
Ouvrez le Terminal et exécutez la commande suivante pour installer Homebrew (un gestionnaire de paquets pour macOS) :
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
### Installer le JDK avec Homebrew (facultatif) :
Exécutez la commande suivante pour installer le JDK :
```
brew install openjdk
```
> Pour Linux (Ubuntu en exemple) :
### Installer OpenJDK :
Ouvrez le Terminal et exécutez les commandes suivantes :
```
sudo apt update
sudo apt install openjdk-11-jdk
```
### Configurer les variables d'environnement Java (facultatif) :
Vous devrez peut-être définir la variable d'environnement JAVA_HOME et mettre à jour la variable PATH. Cette étape est souvent effectuée automatiquement.
## 2.Vérifier votre installation 
### Vérifier l'installation de Java :
Ouvrez un terminal ou une invite de commandes.
Exécutez les commandes suivantes :
```
java -version
javac -version
```
## 3.Java Hello World Example
Voici un exemple simple d'un programme "Hello World" en Java :
```
public class Simple{
    public static void main(String[] args) {
        // Affiche le message "Hello, World!" dans la console
        System.out.println("Hello, World!");
    }
}
```
#### Explications du code :
- public class Simple: 
Définit une classe Java nommée Simple.
- public static void main(String[] args):
 La méthode principale où le programme commence son exécution.
- System.out.println("Hello, World!");:
 Affiche le message "Hello, World!" dans la console.

Pour exécuter ce programme, enregistrez-le dans un fichier avec l'extension .java (par exemple, Simple.java). Ensuite, ouvrez une fenêtre de terminal, naviguez vers le répertoire où vous avez enregistré le fichier et utilisez les commandes suivantes
### Compilez le programme avec la commande :
```
javac Simple.java
```
### Exécutez le programme compilé avec la commande :
```
java Simple
```
Lorsque nous compilons un programme Java à l’aide de l’outil javac, le compilateur Java convertit le code source en code octet.

![javacodecompile](https://static.javatpoint.com/images/core/javacodecompile.png)

## 4.Java Variables
Une variable est un conteneur qui contient la valeur pendant l’exécution du programme Java. Une variable est affectée avec un type de données.
Variable est un nom d’emplacement de mémoire. Il existe trois types de variables en java : local, instance et statique.
Il existe deux types de données en Java : primitif et non primaire.
### Déclarer les variables en Java
En Java, vous pouvez déclarer des variables pour stocker et manipuler des données.
On peut facilement percevoir qu’en déclarant une variable, nous devons nous occuper de deux choses :


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









