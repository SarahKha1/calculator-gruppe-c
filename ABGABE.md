# Abgabe der Gruppe

Vor der Abgabe ausfüllen und committen. Ablauf: [Abgabeanleitung](docs/ABGABE.md).

**Moodle-Gruppe (A, B, C oder G):** C

## Mitglieder

| GitHub-Benutzername        | Arbeitsteam beim Einstieg (1 oder 2) |
|----------------------------|--------------------------------------|
| Adea5B                     | 1                                    |
| RamzyYoussef               | 2                                    |
| SarahKha1                  | 1                                    |
| NataliiaVoroninaCampus02AT | 2                                    |

Gruppe G ergänzt eine fünfte Zeile. Nennt alle Mitglieder und dokumentiert unten
auch die wechselnde Besetzung des Zweier- und Dreierteams.
Vollständige Namen und die Zuordnung zu den GitHub-Benutzernamen meldet ihr in Moodle.

## Aufgaben und Nachweise

Status: noch nicht freigegeben, in Arbeit oder erledigt.

| Aufgabe | Status         | Issues / Pull Requests | Neue Tests bzw. CI-Nachweis |
| --- |----------------| --- | --- |
| 1: Modulo | erledigt       | Direkte Commits auf main; Issue/PR für diese Aufgabe nicht vorhanden, soweit ersichtlich | testModuloOperation, testModuloWithoutRemainder, testModuloWithNegativeNumber, testModuloByZero, testModuloWithOneNumber; |
| 2: E2E-Tests | erledigt       | noch ausfüllen | EndToEndTest.java mit testAddition und testDivision, zwei neue XML-Testdateien (e2eTest01.xml, e2eTest02.xml) |
| 3: sin/cos | erledigt  | [Issue #1](https://github.com/SarahKha1/calculator-gruppe-c/issues/1), [Pull Request #2](https://github.com/SarahKha1/calculator-gruppe-c/pull/2) | 6 Unit-Tests, 2 E2E-Tests (e2eSin.xml, e2eCos.xml), CI: 24 Tests erfolgreich, 0 Fehler |
| 4: Skalarprodukt | noch ausfüllen | noch ausfüllen | noch ausfüllen |
| CI | noch ausfüllen | noch ausfüllen | noch ausfüllen |

## Zusammenarbeit

Nennt für die fälligen Aufgaben die beteiligten Arbeitsteams und verlinkt die
gegenseitigen Reviews. Beschreibt kurz, wie ihr die Rollen gewechselt habt.

Die Umsetzung von Aufgabe 3 erfolgte durch Adea5B (Arbeitsteam 1).
Dabei wurden die Sinus- und Kosinus-Funktionen implementiert und durch Unit- und E2E-Tests überprüft.
Die Änderungen wurden über Issue #1 und Pull Request #2 dokumentiert.
Arbeitsteam 2 wurde zur Überprüfung eingebunden. Anschließend wurde der Pull Request erfolgreich in main übernommen.

## Offene Probleme

Was funktioniert noch nicht oder weicht von der Aufgabenstellung ab?
Wenn keine Probleme bekannt sind, schreibt ausdrücklich „Keine bekannt“.

Bei Aufgabe 3 gab es zunächst Schwierigkeiten beim Ausführen der Tests über IntelliJ und Maven.
Das Problem konnte behoben werden. Anschließend liefen alle 24 Tests erfolgreich durch.
Aktuell sind keine offenen Probleme bekannt.

Release-Link, Tag und vollständige Commit-ID nach dem Release in Moodle eintragen.
