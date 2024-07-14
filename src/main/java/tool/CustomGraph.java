package tool;

public class CustomGraph {
    public static Node createGraph(){
            Node nodeOne = new Node('□',1);

            Node nodeHelp = nodeOne;
            Node nodeTwo = new Node('□',1);

            Link link = new Link('F',null,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node('□',1);
            link = new Link('O',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node(' ',1);
            link = new Link('R',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node(' ',1);
            link = new Link('(',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node('□',1);
            link = new Link('I',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node('□',1);
            link = new Link('N',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node('□',1);
            link = new Link('T',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo;
            nodeTwo = new Node(' ',1);
            link = new Link(' ',nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;


            nodeOne = nodeTwo;
            nodeTwo = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),2);
            link = new Link(CustomSet.getSetOfCharacters(),nodeOne,nodeTwo);
            nodeOne.getLinks()[0] = link;

            nodeOne = nodeTwo; // 12
            nodeTwo = new Node(' ',1); // 14
            link = new Link(' ',nodeOne,nodeTwo); // связь 12 - 14 space
            nodeOne.getLinks()[0] = link; // Закинул связь в 12
            Node nodeThree = new Node(' ',3); // 13
            link = new Link('=',nodeOne,nodeThree); // связь 12 - 13 =
            nodeOne.getLinks()[1] = link; // Закинул связь в 12

            nodeOne = nodeTwo; // 14
            link = new Link('=',nodeOne,nodeThree); // Связь 14 - 13 =
            nodeOne.getLinks()[0] = link; // Закинул в 14 связь, кот-ая выше

            nodeOne = nodeThree; // 13 (3 связи)
            nodeTwo = new Node('□',2); // 17
            link = new Link('0',nodeThree,nodeTwo); // связь 13 - 17 0
            nodeOne.getLinks()[0] = link; // Закинул связь 13 - 17 в 13 (0)

            nodeThree = new Node('□',1); // 16
            link = new Link('-',nodeOne,nodeThree); // связь 13 - 16 '-'
            nodeOne.getLinks()[1] = link; // закинул в 13 связь 13 - 16 '-'

            Node nodeFour = new Node(CustomSet.getSetOfNumber(),2); // 18
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeOne,nodeFour); // связь 13 - 18 1|..|9
            nodeOne.getLinks()[2] = link;// закинул в 13 связь 13 - 18

            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeThree,nodeFour); //связь 16 - 18
            nodeThree.getLinks()[0] = link; // закинул в 16 связь 16 - 18 1|...|9

            nodeOne = new Node(' ',1); // 20
            link = new Link(' ', nodeTwo,nodeOne); // связь 17 - 20
            nodeTwo.getLinks()[1] = link; // закинул в 17 (вправо) связь 17 - 20
            link = new Link(' ',nodeFour,nodeOne); // связь 18 - 20
            nodeFour.getLinks()[0] = link; // закинул в 18 (лево) связь 18 - 20

            nodeThree = new Node(' ',1);// 19
            link = new Link(';',nodeTwo,nodeThree); // связь 17 - 19
            nodeTwo.getLinks()[0] = link;
            link = new Link(';',nodeFour,nodeThree); // связь 18 - 19
            nodeFour.getLinks()[1] = link; // закинул в 18 связь 18 - 19
            link = new Link(';',nodeOne,nodeThree); // связь 20 - 19
            nodeOne.getLinks()[0] = link; // закинул в 20 связь 20 -19

            nodeOne = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),1); // 21
            link = new Link(CustomSet.getSetOfCharacters(),nodeThree,nodeOne); // связь 19 - 21
            nodeThree.getLinks()[0] = link; // закинул в 19 связь 19 - 21

            nodeThree = new Node(' ',3);//23
            link = new Link(' ',nodeOne,nodeThree);// связь 21 - 23
            nodeOne.getLinks()[0] = link; // закинул в 21 связь 21 - 23

            nodeOne = new Node('□',2); // 24
            link = new Link(CustomSet.getSetOfComparisonSigns(),nodeThree,nodeOne); // связь 23 - 24
            nodeThree.getLinks()[0] = link; // закинул в 23 связь 23 - 24

            nodeTwo = new Node('□',1); // 25
            link = new Link('!',nodeThree,nodeTwo); // связь 23 - 25
            nodeThree.getLinks()[1] = link; // закинул в 23 связь 23 - 25

            nodeFour = new Node('□',2); //26
            link = new Link('=',nodeThree,nodeFour); // связь 23 - 26
            nodeThree.getLinks()[2] = link; // закинул в 23 связь 23 - 26

            nodeThree = new Node('□',1);// 27
            link = new Link('=',nodeOne,nodeThree); // связь 24 - 27
            nodeOne.getLinks()[1] = link; // закинул в 24 (вправо) связь 24 - 27

            link = new Link('=',nodeTwo,nodeThree); // связь 25 - 27
            nodeTwo.getLinks()[0] = link;// закинул в 25 связь 25 - 27

            link = new Link('=',nodeFour,nodeThree); // связь 26 - 27
            nodeFour.getLinks()[0] = link; // закинул в 26 (влево) связь 26 - 27

            nodeTwo = new Node(' ',4); // 28
            link = new Link(' ',nodeOne,nodeTwo); // связь 24 - 28
            nodeOne.getLinks()[0] = link; // закинул в 24 связь 24 - 28

            link = new Link(' ',nodeThree,nodeTwo); // связь 27 - 28
            nodeThree.getLinks()[0] = link; // закинул в 27 связь 27 - 28

            link = new Link(' ',nodeFour,nodeTwo); // связь 26 - 28
            nodeFour.getLinks()[1] = link; // закинул в 26 связь 26 - 28 (справа)

            nodeOne = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),3);// 29
            link = new Link(CustomSet.getSetOfCharacters(),nodeTwo,nodeOne); // связь 28 - 29
            nodeTwo.getLinks()[0] = link; // закинул в 28 связь 28 - 29

            nodeThree = new Node(' ',1); // 46
            link = new Link(';',nodeOne,nodeThree); // связь 29 - 46
            nodeOne.getLinks()[0] = link; // закинул в 29 связь 29 - 46

            nodeFour = new Node('□',4); // 40
            link = new Link('[',nodeOne,nodeFour); // связь 29 - 40
            nodeOne.getLinks()[1] = link; // закинул в 29 связь 29 - 40

            Node nodeFive = new Node(' ',1); // 33
            link = new Link(' ',nodeOne,nodeFive); // связь 29 - 33
            nodeOne.getLinks()[2] = link; // закинул в 29 связь 29 - 33

            nodeOne = new Node('□',1); // 44
            link = new Link('0',nodeFour,nodeOne); // связь 40 - 44
            nodeFour.getLinks()[0] = link; // закинул в 40 связь 40 - 44

            Node nodeSix = new Node('□',2); //42
            link = new Link(']',nodeOne,nodeSix); // связь 44 - 42
            nodeOne.getLinks()[0] = link; // закинул в 44 связь 44 - 42

            Node nodeSeven = new Node('□',1); // 45
            link = new Link('-',nodeFour,nodeSeven); // связь 40 - 45
            nodeFour.getLinks()[2] = link; // закинул в 40 связь 40 - 45

            nodeOne = new Node(CustomSet.getSetOfNumber(),1); // 43
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeFour,nodeOne); // связь 40 - 43
            nodeFour.getLinks()[1] = link; // закинул в 40 связь 40 - 43

            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeSeven,nodeOne); // связь 45 - 43
            nodeSeven.getLinks()[0] = link; // закинул в 45 связь 45 - 43

            link = new Link(']',nodeOne, nodeSix); // связь 43 - 42
            nodeOne.getLinks()[0] = link; // закинул в 43 связь 43 - 42

            nodeOne = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),1); //41
            link = new Link(CustomSet.getSetOfCharacters(),nodeFour,nodeOne); // связь 40 - 41
            nodeFour.getLinks()[3] = link; // закинул в 40 связь 40 - 41

            link = new Link(']',nodeOne,nodeSix); // связь 41 - 42
            nodeOne.getLinks()[0] = link; // закинул в 41 связь 41 - 42

            link = new Link(' ',nodeSix,nodeFive); // связь 42 - 33
            nodeSix.getLinks()[1] = link; // закинул в 42 связь 42 - 33
            link = new Link(';',nodeSix,nodeThree); // связь 42 - 46
            nodeSix.getLinks()[0] = link; // закинул в 42 связь 42 - 46

            nodeOne = new Node('□',3); // 31
            link = new Link('0',nodeTwo,nodeOne); // связь 28 - 31
            nodeTwo.getLinks()[1] = link; // закинул в 28 связь 28 - 31

            link = new Link(';',nodeOne,nodeThree); // связь 31 - 46
            nodeOne.getLinks()[0] = link; // закинул в 31 связь 31 - 46

            link = new Link(' ',nodeOne,nodeFive); // связь 31 - 33
            nodeOne.getLinks()[1] = link; // закинул в 31 связь 31 - 33

            nodeFour = new Node('□',1); // 34
            link = new Link('.',nodeOne,nodeFour); // связь 31 - 34
            nodeOne.getLinks()[2] = link; // закинул в 31 связь 31 - 34

            nodeOne = new Node('□',1); // 32
            link = new Link('-',nodeTwo,nodeOne); // связь 28 - 32
            nodeTwo.getLinks()[3] = link; // закинул в 28 связь 28 - 32

            nodeSix = new Node(CustomSet.getSetOfNumber(),4); // 30
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeTwo,nodeSix); // связь 28 - 30
            nodeTwo.getLinks()[2] = link; // закинул в 28 связь 28 - 30

            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeOne,nodeSix); // связь 32 - 30
            nodeOne.getLinks()[0] = link; // закинул в 32 связь 32 - 30

            link = new Link(' ',nodeSix,nodeFive);// связь 30 - 33
            nodeSix.getLinks()[0] = link; // закинул в 30 связь 30 - 33

            link = new Link('.',nodeSix,nodeFour); // связь 30 - 34
            nodeSix.getLinks()[1] = link; // закинул в 30 связь 30 - 34

            link = new Link(';',nodeSix,nodeThree); // связь 30 -46
            nodeSix.getLinks()[3] = link; // закинул в 30 связь 30 - 46

            nodeTwo = new Node(CustomSet.getSetOfNumber(),3); // 35
            link = new Link(CustomSet.getSetOfNumber(),nodeFour,nodeTwo); // связь 34 - 35
            nodeFour.getLinks()[0] = link; // закинул в 34 связь 34 - 35

            nodeFour = new Node('□',3);// 36
            link = new Link('E',nodeSix,nodeFour); // связь 30 - 36
            nodeSix.getLinks()[2] = link; // закинул в 36 связь 30 - 36

            link = new Link(' ',nodeTwo,nodeFive); // связь 35 - 33
            nodeTwo.getLinks()[0] = link; // закинул в 35 связь 35 - 33
            link = new Link(';',nodeTwo,nodeThree); // связь 35 - 46
            nodeTwo.getLinks()[1] = link; // закинул в 35 связь 35 - 46
            link = new Link('E',nodeTwo,nodeFour); // связь 35 - 36
            nodeTwo.getLinks()[2] = link; // закинул в 35 связь 35 - 36

            nodeOne = new Node('□',1); // 37
            link = new Link('-',nodeFour,nodeOne); // связь 36 - 37
            nodeFour.getLinks()[2] = link; // закинул в 36 связь 36 - 37

            nodeTwo = new Node('□',1); // 38
            link = new Link('+',nodeFour,nodeTwo); // связь 36 - 38
            nodeFour.getLinks()[0] = link; // закинул в 36 связь 36 - 38

            nodeSix = new Node(CustomSet.getSetOfNumber(),2); // 39
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeFour,nodeSix); // связь 36 - 39
            nodeFour.getLinks()[1] = link; // закинул в 36 связь 36 - 39

            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeOne,nodeSix); // связь 37 - 39
            nodeOne.getLinks()[0] = link; // закинул в 37 связь 37 - 39

            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeTwo,nodeSix); // связь 38 - 39
            nodeTwo.getLinks()[0] = link; // закинул в 38 связь 38 - 39

            link = new Link(' ',nodeSix,nodeFive); // связь 39 - 33
            nodeSix.getLinks()[0] = link; // закинул в 39 связь 39 - 33

            link = new Link(';',nodeSix,nodeThree); // связь 39 - 46
            nodeSix.getLinks()[1] = link; // закинул в 39 связь 39 - 46

            link = new Link(';',nodeFive,nodeThree); // связь 33 - 46
            nodeFive.getLinks()[0] = link; // закинул в 33 связь 33 - 46

            nodeOne = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),2); // 48
            link = new Link(CustomSet.getSetOfCharacters(),nodeThree,nodeOne); // связь 46 - 48
            nodeThree.getLinks()[0] = link; // закинул в 46 связь 46 - 48

            nodeTwo = new Node('□',1); // 49
            link = new Link('-',nodeOne,nodeTwo); // связь 48 - 49
            nodeOne.getLinks()[0] = link; // закинул в 48 связь 48 - 49

            nodeThree = new Node(' ',1); // 51
            link = new Link('-',nodeTwo,nodeThree); // связь 49 - 51
            nodeTwo.getLinks()[0] = link; // закинул в 49 связь 49 - 51

            nodeTwo = new Node('□',1); // 50
            link = new Link('+',nodeOne,nodeTwo); // связь 48 - 50
            nodeOne.getLinks()[1] = link; // закинул в 48 связь 48 - 50

            nodeOne = new Node('□',2); // 52
            link = new Link('+',nodeTwo,nodeOne); // связь 50 - 52
            nodeTwo.getLinks()[0] = link; // закинул в 50 связь 50 - 52

            link = new Link(' ',nodeOne,nodeThree); // связь 52 - 51
            nodeOne.getLinks()[0] = link; // закинул в 52 связь 52 - 51

            nodeTwo = new Node('□',1); // 53
            link = new Link(')',nodeThree,nodeTwo); // связь 51 - 53
            nodeThree.getLinks()[0] = link; // закинул в 51 связь 51 - 53
            link = new Link(')',nodeOne,nodeTwo); // связь 52 - 53
            nodeOne.getLinks()[1] = link; // закинул в 52 связь 52 - 53

            nodeOne = new Node('□',1); // 55
            link = new Link(' ',nodeTwo,nodeOne); // связь 53 - 55
            nodeTwo.getLinks()[0] = link; // закинул в 53 связь 53 - 55

            nodeTwo = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),3); // 56
            link = new Link(CustomSet.getSetOfCharacters(),nodeOne,nodeTwo); // связь 55 - 56
            nodeOne.getLinks()[0] = link; // закинул в 55 связь 55 - 56

            nodeOne = new Node(' ',4); // 64
            link = new Link('=',nodeTwo,nodeOne); // связь 56 - 64
            nodeTwo.getLinks()[0] = link;// закинул в 56 связь 56 - 64

            nodeThree = new Node(' ',1); // 57
            link = new Link(' ',nodeTwo,nodeThree); // связь 56 - 57
            nodeTwo.getLinks()[1] = link; // закинул в 56 связь 56 - 57
            link = new Link('=',nodeThree,nodeOne); // связь 57 - 64
            nodeThree.getLinks()[0] = link; // закинул в 57 связь 57 - 64

            nodeThree = new Node('□',4); // 58
            link = new Link('[',nodeTwo,nodeThree); // связь 56 - 58
            nodeTwo.getLinks()[2] = link; // закинул в 56 связь 56 - 58

            nodeTwo = new Node('□',1); // 62
            link = new Link('0',nodeThree,nodeTwo); // связь 58 - 62
            nodeThree.getLinks()[0] = link; // закинул в 58 связь 58 - 62

            nodeFour = new Node(' ',1); //63
            link = new Link(']',nodeTwo,nodeFour); // связь 62 - 63
            nodeTwo.getLinks()[0] = link; // закинул в 62 связь 62 - 63

            nodeTwo = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),1); // 59
            link = new Link(CustomSet.getSetOfCharacters(),nodeThree,nodeTwo); // связь 58 - 59
            nodeThree.getLinks()[1] = link; // закинул в 58 связь 58 - 59

            link = new Link(']', nodeTwo, nodeFour); // связь 59 - 63
            nodeTwo.getLinks()[0] = link; // закинул в 59 связь 59 - 63

            nodeTwo = new Node('□',1); // 61
            link = new Link('-',nodeThree,nodeTwo); // связь 58 - 61
            nodeThree.getLinks()[3] = link; // закинул в 58 связь 58 - 61

            nodeFive = new Node(CustomSet.getSetOfNumber(),1); // 60
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeThree,nodeFive); // связь 58 - 60
            nodeThree.getLinks()[2] = link; // закинул в 58 связь 58 - 60

            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeTwo,nodeFive); // связь 61 - 60
            nodeTwo.getLinks()[0] = link; // закинул в 61 связь 61 - 60

            link = new Link(']',nodeFive,nodeFour); // связь 60 - 63
            nodeFive.getLinks()[0] = link; // закинул в 60 связь 60 - 63

            link = new Link('=', nodeFour,nodeOne); // связь 63 - 64
            nodeFour.getLinks()[0] = link; // закинул в 63 связь 63 - 64

            // stmt часть nodeOne 64

            nodeTwo = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),4); // 65
            link = new Link(CustomSet.getSetOfCharacters(),nodeOne,nodeTwo); // связь 64 - 65
            nodeOne.getLinks()[1] = link; // закинул в 64 связь 64 - 65

            nodeThree = new Node('□',4); // 66
            link = new Link('[',nodeTwo,nodeThree); // связь 65 - 66
            nodeTwo.getLinks()[1] = link; // закинул в 65 связь 65 - 66

            nodeFour = new Node('□',1); //68
            link = new Link('0',nodeThree,nodeFour); // связь 66 - 68
            nodeThree.getLinks()[0] = link; // закинул в 66 связь 66 - 68

            nodeFive = new Node('□',3); // 71
            link = new Link(']',nodeFour,nodeFive); // связь 68 - 71
            nodeFour.getLinks()[0] = link; // закинул в 68 связь 68 - 71

            nodeFour = new Node(CustomSet.getSetOfCharactersWithoutUnderscore(),1); // 67
            link = new Link(CustomSet.getSetOfCharacters(),nodeThree,nodeFour); // связь 66 - 67
            nodeThree.getLinks()[1] = link; // закинул в 66 связь 66 - 67
            link = new Link(']',nodeFour,nodeFive); // связь 67 - 71
            nodeFour.getLinks()[0] = link; // закинул в 67 связь 67 - 71

            nodeFour = new Node('□',1); //69
            link = new Link('-',nodeThree,nodeFour); // связь 66 - 69
            nodeThree.getLinks()[2] = link; // закинул в 66 связь 66 - 69

            nodeSix = new Node(CustomSet.getSetOfNumber(),1); // 70
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeFour,nodeSix); // связь 69 - 70
            nodeFour.getLinks()[0] = link; // закинул в 69 связь 69 - 70
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeThree,nodeSix); // связь 66 - 70
            nodeThree.getLinks()[3] = link; // закинул в 66 связь 66 - 70
            link = new Link(']',nodeSix,nodeFive); // связь 70 - 71
            nodeSix.getLinks()[0] = link; // закинул в 70 связь 70 - 71

            nodeThree = new Node(' ',2); // 82
            link = new Link(' ',nodeFive,nodeThree); // связь 71 - 82
            nodeFive.getLinks()[1] = link; // закинул в 71 связь 71 - 82

            nodeFour = new Node('□',0); // 81
            link = new Link(';',nodeFive,nodeFour); // связь 71 - 81
            nodeFive.getLinks()[0] = link; // закинул в 71 связь 71 - 81
            link = new Link(' ',nodeTwo,nodeThree); // связь 65 - 82
            nodeTwo.getLinks()[0] = link; // закинул в 65 связь 65 - 82
            link = new Link(';',nodeThree,nodeFour); // связь 82 - 81
            nodeThree.getLinks()[0] = link; // закинул в 82 связь 82 - 81
            link = new Link(';',nodeTwo,nodeFour); // связь  65 - 81
            nodeTwo.getLinks()[3] = link; // закинул в 65 связь 65 - 81

            nodeSix = new Node(' ',4); //83
            link = new Link(CustomSet.getSetOfSigns(),nodeTwo,nodeSix); // связь 65 - 83
            nodeTwo.getLinks()[2] = link; // закинул в 65 связь 65 - 83
            link = new Link(CustomSet.getSetOfCharacters(),nodeSix,nodeTwo); // связь 83 - 65
            nodeSix.getLinks()[3] = link; // закинул в 83 связь 83 - 65
            link = new Link(CustomSet.getSetOfSigns(),nodeFive,nodeSix); // связь 71 - 83
            nodeFive.getLinks()[2] = link; // закинул в 71 связь 71 - 83
            link = new Link(CustomSet.getSetOfSigns(),nodeThree,nodeSix); // связь 82 - 83
            nodeThree.getLinks()[1] = link; // закинул в 82 связь 82 - 83

            nodeFive = new Node('□',4); // 72
            link = new Link('0',nodeOne,nodeFive); // связь 64 -72
            nodeOne.getLinks()[0] = link; // закинул в 64 связь 64 - 72
            link = new Link(' ',nodeFive,nodeThree); // связь 72 - 82
            nodeFive.getLinks()[3] = link; // закинул в 72 связь 72 - 82
            link = new Link(CustomSet.getSetOfSigns(),nodeFive,nodeSix);// связь 72 - 83
            nodeFive.getLinks()[2] = link;// закинул в 72 связь 72 - 83
            link = new Link('0',nodeSix,nodeFive); // связь 83 - 72
            nodeSix.getLinks()[0] = link; // закинул в 83 связь 83 - 72
            link = new Link(';',nodeFive,nodeFour); // связь 72 - 81
            nodeFive.getLinks()[0] = link; // закинул в 72 связь 72 - 81

            nodeSeven = new Node(' ',4); // 84
            link = new Link(CustomSet.getSetOfCharacters(),nodeSeven,nodeTwo); // связь 84 - 65
            nodeSeven.getLinks()[3] =link; // закинул в 84 связь 84 - 65
            link = new Link(' ',nodeSix,nodeSeven); // связь 83 - 84
            nodeSix.getLinks()[2] = link; // закинул в 83 связь 83 - 84
            link = new Link('0',nodeSeven,nodeFive); // связь 84 - 72
            nodeSeven.getLinks()[0] = link; // закинул в 84 связь 84 - 72

            nodeTwo = new Node(CustomSet.getSetOfNumber(),5); // 74
            link = new Link(' ',nodeTwo,nodeThree); // связь 74 - 82
            nodeTwo.getLinks()[4] = link; // закинул в 74 связь 74 - 82
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeSix,nodeTwo); // связь 83 - 74
            nodeSix.getLinks()[1] = link; // закинул в 83 связь 83 - 74
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeSeven,nodeTwo); // связь 84 - 74
            nodeSeven.getLinks()[1] = link; // закинул в 84 связь 84 - 74
            link = new Link(CustomSet.getSetOfSigns(),nodeTwo,nodeSix); // связь 74 - 83
            nodeTwo.getLinks()[3] = link; // закинул в 74 связь 74 - 83
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeOne,nodeTwo); // связь 64 - 74
            nodeOne.getLinks()[3] = link; // закинул в 64 связь 64 - 74
            link = new Link(';',nodeTwo,nodeFour); // связь 74 - 81
            nodeTwo.getLinks()[2] = link; // закинул в 74 связь 74 - 81

            Node nodeEight = new Node('□',1); // 73
            link = new Link('-',nodeSeven,nodeEight); // связь 84 - 73
            nodeSeven.getLinks()[2] = link; // закинул в 84 связь 84 - 73
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeEight,nodeTwo); // связь 73 - 74
            nodeEight.getLinks()[0] = link; // закинул в 73 связь 73 - 74
            link = new Link('-',nodeOne,nodeEight); // связь 64 - 73
            nodeOne.getLinks()[2] =link; // закинул в 64 связь 64 - 73

            nodeOne = new Node('□',1); // 75
            link = new Link('.',nodeTwo,nodeOne); // связь 74 - 75
            nodeTwo.getLinks()[0] = link;
            link = new Link('.',nodeFive,nodeOne); // связь 72 - 75
            nodeFive.getLinks()[1] = link; // закинул в 72 связь 72 - 75

            nodeFive = new Node(CustomSet.getSetOfNumber(),4); // 76
            link = new Link(CustomSet.getSetOfNumber(),nodeOne,nodeFive); // связь 75 - 76
            nodeOne.getLinks()[0] = link; // закинул в 75 связь 75 - 76
            link = new Link(CustomSet.getSetOfSigns(),nodeFive,nodeSix); // связь 76 - 83
            nodeFive.getLinks()[3] = link; // закинул в 76 связь 76 - 83
            link = new Link(' ',nodeFive,nodeThree); // связь 76 - 82
            nodeFive.getLinks()[0] = link; // закинул в 76 связь 76 - 82
            link = new Link(';',nodeFive,nodeFour); // связь 76 - 81
            nodeFive.getLinks()[1] = link; // закинул в 76 связь 76 - 81

            nodeOne = new Node('□',3); // 77
            link = new Link('E',nodeFive,nodeOne); // связь 76 - 77
            nodeFive.getLinks()[2] = link; // закинул в 76 связь 76 - 77
            link = new Link('E',nodeTwo,nodeOne); // связь 74 - 77
            nodeTwo.getLinks()[1] = link; // закинул в 74 связь 74 - 77

            nodeFive = new Node(CustomSet.getSetOfNumber(),3); // 80
            link = new Link(' ',nodeFive,nodeThree); // связь 80 - 82
            nodeFive.getLinks()[0] = link; // закинул в 80 связь 80 - 82
            link = new Link(CustomSet.getSetOfSigns(),nodeFive,nodeSix); // связь 80 - 83
            nodeFive.getLinks()[2] = link; // закинул в 80 связь 80 - 83
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeOne,nodeFive); // связь 77 - 80
            nodeOne.getLinks()[0] = link; // закинул в 77 связь 77 - 80
            link = new Link(';',nodeFive,nodeFour); // связь 80 - 81
            nodeFive.getLinks()[1] = link; // закинул в 80 связь 80 - 81

            nodeTwo = new Node('□',1); // 78
            link = new Link('+',nodeOne,nodeTwo); // связь 77 - 78
            nodeOne.getLinks()[1] = link; // закинул в 77 связь 77 - 78
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeTwo,nodeFive); // связь 78 - 80
            nodeTwo.getLinks()[0] = link; // закинул в 78 связь 78 - 80

            nodeTwo = new Node('□',1); // 79
            link = new Link('-',nodeOne,nodeTwo); // связь 77 - 79
            nodeOne.getLinks()[2] = link; // закинул в 77 связь 77 - 79
            link = new Link(CustomSet.getSetOfNumberWithoutZero(),nodeTwo,nodeFive); // связь 79 - 80
            nodeTwo.getLinks()[0] = link;



//        nodeSeven, nodeFour, nodeOne, nodeTwo, nodeSix, node Five


            return nodeHelp;
    }
}
