# fight_simulator_java
school project with some additional task

the task(in hungarian, i will translate it maybe sometimes):
 -Készítsen egy Harcos osztályt, amely tartalmaz egy név, egy minSebzés és egy maxSebzés adattagot. Készítsen egy metódust, a Harcos osztályban, ami visszaad egy véletlenszerű értéket a minSebzés és a maxSebzés között.
 -Készítsen egy Fegyver osztályt, amely ugyanazokat az adattagokat tartalmazza, mint a Harcos! Egészítse ki a Harcos osztályt egy Fegyver adattaggal is! A Harcos sebzésszámító eljárása a harcos minsebzése+fegyver minsebzése és a harcos minsebzése és a fegyver maxsebzése közötti értéket generáljon!
 -Lássuk el mind a Harcos és Fegyver osztályokat egy kritSebzésEsély adattaggal, amely százalékos formában hordozza a kritikus sebzés esélyét! A sebzésszámító metódusban vegye figyelembe a Harcos objektum és a és a fegyverének összegzett kritikus sebzési esélyét, tehát a generálások „összegzett kritikus sebzés” százalékában duplázza meg a véletlengenerált sebzést!
 
 -Készítsen egy olyan fegyver továbbfejlesztést (enchantment) megvalósító osztályt, amely gem-ekkel (tulajdonságnövelő kövekkel) képes növelni a fegyver sebzését és a kritikus találatainak az esélyét! Készítsen konzolos felületet, ahol:
 Megjeleníti a fegyver továbbfejlesztés előtti értékeit;
 Kilistázza az elérhető köveket;
 Bekéri a kiválasztott kő sorszámát;
 Kiírja a gem-mel megnövelt értéket;
 Rákérdez, hogy véglegesítheti-e a továbbfejlesztést;
 Pl:Select a gem to enchant:1. Warrior’s gem (+25damage, +0.04%critical hit chance)2. Rouge’s gem (+14damage, +0,11%critical hit chance);
 Enchantment result: Two handed axe, damage:159, critical hit chance:36%;
 Would you like to apply?(y/n);

 Készítsen egy játékot, melyben bárki bárkit lőhet a következők szerint:
 A játékban Harcosok harcoljanak a köv adattagokkal:
 mark: char, ami azonosítja a katonát, tehát legyen egyedi (név);
 hp: int életerő (health point), ha 0-ra csökken, akkor a harcos meghal;
 location:Point2D, nekünk kell megvalósítani;
 Weapon: fegyver;
 A Weapon osztály adattagjai:
 damageMin: min sebzés, damageMax: max sebzés;
 criticalHitChance: kritikus sebzés esélye;
 A Weapon osztály legyen képes generálni egy sebzést az adattagjai alapján;
 A Harcos osztály legyen képes elszenvedni egy sebzést, amely csökkenti a hp adattagját. A hp adattag értéke min 0 lehet!;
 Több harcos is harcolhasson, mindegyiket a programlogika irányítsa! Egy Harcos mindig a hozzá legközelebb álló, élő ellenségét támadja!
 A játék menete:
 A játék körökből épüljön fel! Egy körben minden harcos támadjon!
 Minden támadáskor írja ki, hogy melyik harcos, melyik ellenségnek, mekkora sebzést okozott.
 Minden kör végén írja ki, hogy melyik harcosnak mennyi hp-ja maradt!
 A körök között billentyűlenyomásra várjon a program!
 A játék addig tart, amíg egyetlen harcos marad csak életben. Ő a nyertes.


I redesigned the task a bit,but essentially it is similar.
