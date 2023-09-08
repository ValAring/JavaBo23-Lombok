package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Schritt 1: Fügt die Lombok-Abhängigkeit zu eurem Projekt hinzu und konfiguriert IntelliJ, um Lombok zu unterstützen.
Schritt 2: Erstellt eine einfache Klasse "Student" mit den folgenden Attributen: id, name, adress, grade.
Schritt 2.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren
für die Entität zu generieren.
Schritt 3: Erstelle einen Teacher Record mit den folgenden Attributen: id, name, subject.
Schritt 4: Erstelle eine Klasse Course mit den folgenden Attributen: id, name, teacher, students.
Schritt 4.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren
für die Entität zu generieren.
Schritt 5: Schreibt eine "Main"-Klasse, in der ihr einige Beispiele für das Erstellen von Students, Teachers und Courses
mit den Konstruktoren anwendet.
Schritt 6: Prüft in der "Main"-Klasse ob die generierten Lombok Methoden korrekt funktionieren(getter, setter, toString,...).

Schritt 1: Fügt zu allen Entitäten das Builder Pattern hinzu und erstellt in der main-Methode mit dem Builder weitere Objekte.
Schritt 2: Nutzt die With-Annotation um das ändern von Eigenschaften zu erleichtern.

Finde herraus was die Lombok Annotation @Value macht und nutze diese für die Klasse Course.
Erstelle einen Record University mit den folgenden Attributen: id, name, courses.
Erstelle eine Klasse UniversityService und implementiere dort folgende Methoden:
Schreibe eine Funktion um die Durschnittsnote eines Courses zu berechnen(Übergebt den Course als Parameter).
Schreibe eine Funktion um die Durschschnittsnote der ganzen Universität zu berechnen
(Übergebe ein Universitäts-Objekt als Parameter).
Schreibe eine Funktion die aus einer Universität alle Schüler mit mindestens der Note 2/"Gut" raussucht und als Liste
zurück gibt(Übergebt ein Universitäts-Objekt als Parameter).
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to introduction of Lombok!");
        Student s1 = new Student(1, "Marceleen", "Cave 60, Land of Ooo", 2.3F);
        Student s2 = new Student(2, "Finn", "Treehouse, Land of Ooo", 3.4F);
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);

        Teacher teach = new Teacher(1, "Bonnabelle", "Physics");
        Course c1 = new Course(1, "Physics 101", teach, myStudents);

        System.out.println(c1.getName());
        System.out.println(c1.getParticipants());

        Student s3 = new Student();
        s3.setID(3);
        s3.setName("Jake");
        s3.setAddress("Treehouse, Land of Ooo");
        s3.setGrade(2.9F);
        myStudents.add(s3);

        System.out.println(s3.toString());

        Teacher t2 = new Teacher(2, "Gunter", "Dark-Arts");
        Course c2 = Course.builder()
                .iD(2).name("Introduction to Dark-Arts").teacher(t2).participants(myStudents)
                .build();

        System.out.println(c2.getName());
        s1.setAddress("Candy Kingdom, Land of Ooo");
        System.out.println(s1);
    }
}