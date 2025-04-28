use('localization-db');
// db.localization.deleteMany({ locale: "fr" });
db.localization.insertOne({
    _id: "fr",
    locale: "fr",
    screens: {
        login: {
            title: "Connexion",
            email: "E-mail",
            password: "Mot de passe",
            login_button: "Se connecter",
            no_account: "Pas de compte ?",
            register_here: "S'inscrire ici"
        },
        register: {
            title: "Inscription",
            name: "Nom",
            email: "E-mail",
            password: "Mot de passe",
            confirm_password: "Confirmez le mot de passe",
            register_button: "Créer un compte",
            have_account: "Vous avez déjà un compte ?",
            login_here: "Se connecter ici"
        },
        home: {
            title: "Mes notes",
            add_note: "Ajouter une note",
            search_placeholder: "Rechercher dans les notes...",
            no_notes: "Aucune note enregistrée"
        },
        edit_note: {
            title: "Modifier la note",
            note_title: "Titre",
            note_body: "Texte de la note",
            save_button: "Enregistrer",
            delete_button: "Supprimer",
            cancel_button: "Annuler"
        },
        view_note: {
            title: "Voir la note",
            edit_button: "Modifier",
            delete_button: "Supprimer",
            back_button: "Retour"
        },
        settings: {
            title: "Paramètres",
            language: "Langue",
            mode: {
                title: "Thème",
                dark: "Sombre",
                light: "Clair"
            },
            notifications: {
                title: "Notifications",
                enable: "Activer les notifications",
                daily_reminder: "Rappel quotidien",
                sound: "Son de notification"
            },
            logout: "Se déconnecter"
        }
    }
});