# tv-player (dépôt fictif)

Mini-projet Java imitant quelques composants Android TV (lecteur vidéo, configuration,
réseau), utilisé pour développer un agent de debug sans accès aux données de l'entreprise.

Compiler et tester (JDK 17+) :

```bash
javac -d out $(find app/src -name "*.java")
java -ea -cp out com.example.tv.network.NetworkClientTest
java -cp out com.example.tv.MainActivity /chemin/vers/player.conf
```

Les tags (`v2.3.0`, `v2.4.0`) représentent des versions livrées, les branches `pr/...`
des Pull Requests en cours de revue.
