# Programowanie-aplikacji-PRA---zad.-2

Właściwości komponentów ( 2 p.)

Zad. 1. GUICOMP (max. punktów 4)

Rozmieścić w oknie  pięć etykiet w układzie BorderLayout.
Etykiety powinny mieć:
a) różne kolory tła,
b) różne kolory pisma,
c) różne wielkości pisma i różne teksty,
d) podpowiedzi (tooltip)
c) różne ramki  


Zad. 2. BUTT1 (max. punktów 4)

Przycisk

Przycisk umieszczony w oknie zmienia kolory swojego tła na skutek kliknięć 
Ustalić dowolną sekwencję kolorów, po jej wyczerpaniu zacząć od pierwszego .


<b>Zad. 3. PLAINEDIT (max. punktów 10)</b>

Prosty edytor

Stworzyć prosty edytor tekstu z opcjami umieszczonymi w menu rozwijalnym 

File 
    Open - otwiera plik wybrany w dialogu wyboru plików i wczytuje plik do edytora
    Save - zapisuje zawartość edytora do bieżącego pliku (jeśli nie ma pliku, to dialog wyboru plików)
    Save As... zapisuje zawartość do pliku wybranego z dialogu
    Exit   - zamknięcie okna i zakończenie działania aplikacji 

Edit 
   Adresy 
        Dom      - dopisuje do edytora w miejscu kursora adres domowy 
        Szkoła    - dopisuje do edytora w miejscu kursora adres szkoły 
        Firma     - dopisuje do edytora w miejscu kursora adres służbowy

Options 
    Foreground     - zmienia kolor pisma na wybraną opcję 
           kolor1 
           ... 
           kolorN 
    Background    - zmienia kolor tła na wybraną opcję 
          kolor1 
          ... 
          kolorN 
    Font size          - zmienia rozmiar pisma na wybraną opcję 
                8 
              10 
               ... 
              24

Zapewnić:

mnemoniki i akceleratory dla opcji Open, Save, Save As..., Exit, Dom, Szkoła, Firma
pokazywanie kolorów w opcjach wyboru koloru (tła i pierwszego planu) w postaci kolorowych kółek
pokazywanie nazwy edytowanego pliku na pasku tytułu (jeślie nie ma pliku - "bez tytułu"),
dialog wyboru pliku ma się otwierać w ostatnio odwiedzonym katalogu; na początku ma to być bieżący katalog.


Wygląd edytora - menu File (warto zwrócić uwagę na separator - czerwoną kreskę - jak ją zrobić???) 

Po otwarciu menu Adresy (jak widać wcześniej został wczytany plik - jego nazwa jest na pasku tytułu; zauważmy też, że wszędzie opcje menu są "wypukłe" - mają kształt przycisków - jak to zrobić ?):

Po wyborze opcji szkoła widoczny dopisany tekst z adresem )zostal dopisany w miejscu kursora - jak to zrobić?). Otwarte menu Background (menu Foreground jest takie samo):



Uwagi:

łatwe umieszczenie kolorów = własna klasa implementująca Icon
należy napisać kilka metod uniwersalnych (np. tworzące opcje menu z zadanymi charakterystykami), w przeciwnym razie kod będzie duży i słabo czytelny
