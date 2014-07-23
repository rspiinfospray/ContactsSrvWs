ContactsSrvWs
=============
Projet test regroupant les technos suivantes :
Spring boot : Spring mvc - Spring tymleaf - restFull


Pour lancer : mvn spring-boot:run (lit les images dans src/main/resources)
Pour lancer en debug : mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
Pour Packager : mvn package (Genere un Jar :D)

Pour lancer le jar : java -jar appli.jar (lit les images dans src/main/webapp)
Pour lancer le jar en debug : java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=5005,suspend=n -jar target/ContactsSrvWs*.jar

Le repertoire webapp doit etre referencé dans le classpath
<classpathentry kind="src" path="src/main/webapp"/>
