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