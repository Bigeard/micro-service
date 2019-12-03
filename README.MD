# Micro Service - Utilisateur

Le projet consiste à mettre en place un micro service avec comme langage de programmation Java.

Avec Java on prendra du Spring et En base de donnée il faut utilier du MySQL

## Installation

La première étape est d'aller sur le site https://start.spring.io/
Pour commencer un projet Spring.

Sélectionner les paramètre qui vous intéresse et télécharger le projet.
Une fois que le telechargement est fini, il faut décompresser le fichier.

Il faut bien sur installer le JDK que vous voulez, de mon côté, j'ai pris JDK13.

Dans mon cas, j'utilise VsCode comme IDE.
Il faut ajouter le module `Java Extension Pack` pour que VsCode soit compatible avec JAVA.

Ouvrer le fichier qui a été décompresser auparavant.
Si tous se passent bien normalement l'installation, des packages se font automatiquement.

## Première partie afficher un `Hello World`

Pour créer un controller il faut aller dans le même fichier que `Applicaion.java` et crée un nouveau fichier `HomeController.java` et ajouter les lignes suivantes:
```JAVA
package re.aventu.micro.service;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {  
    @RequestMapping("/hello")  
    public String hello(){  
        return"Hello World!";  
    }
}  
```

## Deuxième étape crée la database et retourner les valeurs

Pour créer la base de donnée avec les tables et ces valeurs il faut utiliser la commande suivante en SQL:
```SQL
-- DROP TABLE user;
CREATE DATABASE `micro-service`;
USE `micro-service`;

CREATE TABLE `user` (
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	firstname varchar(255) NOT NULL,  
	lastname varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO user (`firstname`, `lastname`, `password`) VALUES ('Robin', 'Bigeard', 'nuggets');

SHOW TABLES;
SELECT * FROM user;
```


java -jar file.jar