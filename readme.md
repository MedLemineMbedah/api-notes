Nom:Mohamed Lemine Salem Mbedah
Mat:IE18689

1)_ mvn -B archetype:generate
-DarchetypeGroupId=org.apache.maven.archetypes
-DgroupId=com.mcnz.maven
-DartifactId=install-maven-tutorial

2)_ teste unitaire avec une commande maven :mvn -Dtest=com.examlpe.apinotes.TestService test

3)_ aprés l'exécution de la commande "maven clean install" l'ordre d'exécution a ete Intégration en premier puis unitaire
4)_la commdande maven pour lancer le projet en évitant tous les testes mvn package -DskipTests
5)_ la dependance postgresql version 4.3.0 introuvable
6)_a commande maven que vus utilisez pour lancer le projet avec un profle défnit  mvn package -DskipTests -P nom_de_profile