use('localization-db');
// db.localization.deleteMany({ locale: "en" });
db.localization.insertOne({
    _id: "en",
    locale: "en",
    screens: {
        login: {
            title: "Login",
            email: "Email",
            password: "Password",
            login_button: "Sign In",
            no_account: "Don't have an account?",
            register_here: "Register here"
        },
        register: {
            title: "Register",
            name: "Name",
            email: "Email",
            password: "Password",
            confirm_password: "Confirm Password",
            register_button: "Create Account",
            have_account: "Already have an account?",
            login_here: "Login here"
        },
        home: {
            title: "My Notes",
            add_note: "Add Note",
            search_placeholder: "Search notes...",
            no_notes: "No saved notes"
        },
        edit_note: {
            title: "Edit Note",
            note_title: "Title",
            note_body: "Note text",
            save_button: "Save",
            delete_button: "Delete",
            cancel_button: "Cancel"
        },
        view_note: {
            title: "View Note",
            edit_button: "Edit",
            delete_button: "Delete",
            back_button: "Back"
        },
        settings: {
            title: "Settings",
            language: "Language",
            mode: {
                title: "Theme",
                dark: "Dark",
                light: "Light"
            },
            notifications: {
                title: "Notifications",
                enable: "Enable notifications",
                daily_reminder: "Daily reminder",
                sound: "Notification sound"
            },
            logout: "Log Out"
        }
    }
});