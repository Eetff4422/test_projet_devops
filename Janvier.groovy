    def genererEntreeJournal(nom) {
        return [titre: "Journal de $nom", texte: "Texte de l'entrée du journal"]
    }
    
    def enregistrerDonnees(donnees) {
        println("Données enregistrées en base de données : $donnees")
    }
    def trackerActivites(objectifs) {
        return [sport: 1, meditation: 7] 
    }
    def envoyerNotification(message) {
        println("Notification envoyée : $message")
    }
    def par = [
      "MOIS" : "Janvier", // nb jours objectif
      "NOM": "Jean",
      "JOUR": 1
    ]
    // Initialiser le suivi
    def objectifs = [
        "ecrireJournal" : 31, // nb jours objectif
        "lireLivre": 1  // nb livres objectif
    ]

    def activites = trackerActivites(objectifs)

    def progression = [
        "ecrireJournal": 0,
        "lireLivre": 0
    ]
    def progression_after_15 = [
        "ecrireJournal" : 15,
        "lireLivre" : 0
    ]

    // Calculer progression en fonction du jour
    def jourActuel = par.JOUR.toInteger()

    if (jourActuel >= 1 && jourActuel < 15) {
        progression.ecrireJournal = jourActuel
        genererEntreeJournal("${par.NOM}").with {
            enregistrerDonnees(it)
            envoyerNotification("Nouvelle entrée pour ${par.NOM}")
        }
    } else {
        if (progression_after_15.ecrireJournal >= 15 && jourActuel == progression_after_15.ecrireJournal) {
            if (progression_after_15.lireLivre == 1) {
                println "Tu es sur la bonne voie, continue de remplir quotidiennement ton journal et tu atteindras ton objectif du mois."
            } else {
                println "Tu es sur la bonne voie mais n'oublie pas de lire $objectifs.lireLivre livre pour atteindre tous tes objectifs."
            }

        } else {
            if (jourActuel >= 15) {
                if (progression_after_15.ecrireJournal == 15) {
                    objectifs.ecrireJournal = 20
                } else {
                    objectifs.ecrireJournal = 15
                }
            } else {
                progression.ecrireJournal = 5
            }

            objectifs.lireLivre = 1

            println "Malheureusement je vois que t'auras du mal à réaliser tes objectifs. Mais ne t'inquiète pas je les ai réajustés pour te permettre de les atteindre. Bonne chance"
        }
    }

    // Afficher progression
    println "Objectifs à atteindre: $objectifs"
    if (jourActuel < 15) {
        println "Progression au $jourActuel ${par.MOIS} : $progression"
    } else {
        println "Progression au $jourActuel ${par.MOIS} : $progression_after_15"
    }
