use('localization-db');
// db.localization.deleteMany({ locale: "it" });
db.localization.insertOne({
    _id: "it",
    locale: "it",
    screens: {
        login: {
            title: "Accesso",
            email: "Email",
            password: "Password",
            login_button: "Accedi",
            no_account: "Non hai un account?",
            register_here: "Registrati qui"
        },
        register: {
            title: "Registrazione",
            name: "Nome",
            email: "Email",
            password: "Password",
            confirm_password: "Conferma password",
            register_button: "Crea account",
            have_account: "Hai già un account?",
            login_here: "Accedi qui"
        },
        home: {
            title: "Le mie note",
            add_note: "Aggiungi nota",
            search_placeholder: "Cerca nelle note...",
            no_notes: "Nessuna nota salvata"
        },
        edit_note: {
            title: "Modifica nota",
            note_title: "Titolo",
            note_body: "Testo della nota",
            save_button: "Salva",
            delete_button: "Elimina",
            cancel_button: "Annulla"
        },
        view_note: {
            title: "Visualizza nota",
            edit_button: "Modifica",
            delete_button: "Elimina",
            back_button: "Indietro"
        },
        settings: {
            title: "Impostazioni",
            language: "Lingua",
            mode: {
                title: "Tema",
                dark: "Scuro",
                light: "Chiaro"
            },
            notifications: {
                title: "Notifiche",
                enable: "Abilita notifiche",
                daily_reminder: "Promemoria quotidiano",
                sound: "Suono delle notifiche"
            },
            logout: "Esci"
        }
    }
});