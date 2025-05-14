use('localization-db');
// db.localization.deleteMany({ locale: "zh" });
db.localization.insertOne({
    _id: "zh",
    locale: "zh",
    screens: {
        login: {
            title: "登录",
            email: "电子邮件",
            password: "密码",
            login_button: "登录",
            no_account: "没有账户？",
            register_here: "注册"
        },
        register: {
            title: "注册",
            name: "姓名",
            email: "电子邮件",
            password: "密码",
            confirm_password: "确认密码",
            register_button: "创建账户",
            have_account: "已有账户？",
            login_here: "登录"
        },
        home: {
            title: "我的笔记",
            add_note: "添加笔记",
            search_placeholder: "搜索笔记...",
            no_notes: "没有保存的笔记"
        },
        edit_note: {
            title: "编辑笔记",
            note_title: "标题",
            note_body: "笔记内容",
            save_button: "保存",
            delete_button: "删除",
            cancel_button: "取消"
        },
        view_note: {
            title: "查看笔记",
            edit_button: "编辑",
            delete_button: "删除",
            back_button: "返回"
        },
        settings: {
            title: "设置",
            language: "语言",
            mode: {
                title: "主题",
                dark: "暗色",
                light: "亮色"
            },
            notifications: {
                title: "通知",
                enable: "启用通知",
                daily_reminder: "每日提醒",
                sound: "通知声音"
            },
            logout: "退出账户"
        }
    }
});