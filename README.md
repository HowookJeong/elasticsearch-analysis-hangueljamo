# elasticsearch-analysis-hangueljamo

[Reference Blog Link](http://jjeong.tistory.com/1067)

* Elasticsearch Analyze Test URL
```
http://localhost:9200/test/_analyze?analyzer=hangueljamo_analyzer&text=Henry 노트북&pretty=1
```

* Analyzed Result
```
{
  "tokens" : [ {
    "token" : "henry",
    "start_offset" : 0,
    "end_offset" : 5,
    "type" : "word",
    "position" : 0
  }, {
    "token" : "ㄴㅌㅂ",
    "start_offset" : 6,
    "end_offset" : 9,
    "type" : "word",
    "position" : 1
  } ]
}
```