# templateプロジェクトの使い方
1. Webからリポジトリ新規作成。templateを指定
1. pom.xmlのtemplate_commonを変更（3か所）
1. settingsは引き継がれないので設定
    1. Actions -> General -> Read and write permissions
    1. Actions -> General -> Accessible from repositories owned by the user 'zuruzirou'
1. リポジトリ作成と同時にactionsが実行され、NGになっている。再実行

# templateプロジェクトの作り方
1. VSCからSpring Initializerで作成
1. setting.xmlを追加、pom.xmlにdistributionManagementを追加、workflow fileを追加
    1. packagesに保存
1. webから以下を設定
    1. Actions -> General -> Read and write permissions
    1. Actions -> General -> Accessible from repositories owned by the user 'zuruzirou'
1. settingsからtemplate projectに指定