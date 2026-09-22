# Password Validator

Java-Projekt zur Passwortprüfung mit verständlichen Fehlermeldungen.

## Passwort-Policy

Ein gültiges Passwort enthält:
- mindestens 8 Zeichen,
- mindestens eine Ziffer (0–9),
- mindestens einen Groß- und Kleinbuchstaben,
- mindestens ein Sonderzeichen aus `!@#$%&*?`.

Häufige Passwörter werden abgelehnt. Der Vergleich mit der Sperrliste
ignoriert Groß-/Kleinschreibung und äußere Leerzeichen.