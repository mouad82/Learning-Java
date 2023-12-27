# Learning-Java
## 1. Installer le Kit de développement Java (JDK) :
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
## 2. Vérifier votre installation :
### Vérifier l'installation de Java :
Ouvrez un terminal ou une invite de commandes.
Exécutez les commandes suivantes :
```
java -version
javac -version
```


