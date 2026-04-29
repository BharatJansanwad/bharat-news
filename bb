{
  "version": "0.4",
  "title": "Bharat Jansanwad Homepage",
  "type": "page",
  "content": [
    {
      "id": "header",
      "elType": "section",
      "settings": {"background_color": "#ffffff"},
      "elements": [
        {
          "id": "col1",
          "elType": "column",
          "settings": {"_column_size": 25},
          "elements": [
            {"elType": "widget", "widgetType": "image", "settings": {"image": {"url": "LOGO_HERE"}}}
          ]
        },
        {
          "id": "col2",
          "elType": "column",
          "settings": {"_column_size": 50},
          "elements": [
            {"elType": "widget", "widgetType": "nav-menu", "settings": {}}
          ]
        },
        {
          "id": "col3",
          "elType": "column",
          "settings": {"_column_size": 25},
          "elements": [
            {"elType": "widget", "widgetType": "button", "settings": {"text": "🔴 LIVE", "background_color": "#D60000"}}
          ]
        }
      ]
    },

    {
      "id": "ticker",
      "elType": "section",
      "settings": {"background_color": "#D60000"},
      "elements": [
        {
          "elType": "column",
          "elements": [
            {
              "elType": "widget",
              "widgetType": "html",
              "settings": {
                "html": "<marquee style='color:#fff;'>🔴 ब्रेकिंग: ताज्या बातम्या येथे...</marquee>"
              }
            }
          ]
        }
      ]
    },

    {
      "id": "hero",
      "elType": "section",
      "elements": [
        {
          "elType": "column",
          "settings": {"_column_size": 70},
          "elements": [
            {"elType": "widget", "widgetType": "image", "settings": {}},
            {"elType": "widget", "widgetType": "heading", "settings": {"title": "मुख्य बातमी"}},
            {"elType": "widget", "widgetType": "text-editor", "settings": {"editor": "थोडक्यात माहिती"}}
          ]
        },
        {
          "elType": "column",
          "settings": {"_column_size": 30},
          "elements": [
            {"elType": "widget", "widgetType": "heading", "settings": {"title": "Trending"}},
            {"elType": "widget", "widgetType": "posts", "settings": {"posts_per_page": 5}}
          ]
        }
      ]
    },

    {
      "id": "video",
      "elType": "section",
      "elements": [
        {
          "elType": "column",
          "settings": {"_column_size": 60},
          "elements": [
            {"elType": "widget", "widgetType": "video", "settings": {"link": "https://youtube.com"}}
          ]
        },
        {
          "elType": "column",
          "settings": {"_column_size": 40},
          "elements": [
            {"elType": "widget", "widgetType": "posts", "settings": {"posts_per_page": 5}}
          ]
        }
      ]
    },

    {
      "id": "category",
      "elType": "section",
      "elements": [
        {
          "elType": "column",
          "elements": [
            {"elType": "widget", "widgetType": "heading", "settings": {"title": "महाराष्ट्र"}},
            {"elType": "widget", "widgetType": "posts", "settings": {"posts_per_page": 6}}
          ]
        }
      ]
    },

    {
      "id": "footer",
      "elType": "section",
      "settings": {"background_color": "#111111"},
      "elements": [
        {
          "elType": "column",
          "elements": [
            {"elType": "widget", "widgetType": "heading", "settings": {"title": "भारत जनसंवाद", "title_color": "#ffffff"}},
            {"elType": "widget", "widgetType": "text-editor", "settings": {"editor": "© 2026 All Rights Reserved"}}
          ]
        }
      ]
    }
  ]
}
