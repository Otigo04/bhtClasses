import urllib.request
import json
import time

url = "https://data.cityofchicago.org/resource/ijzp-q8t2.json?$where=year=2024&$select=block,count(*)%20as%20count&$group=block&$order=count%20DESC&$limit=10"
#$where=year=2024 -> Daten aus 2024, $select=block, count(*) as count -> Nur Felder, die ich benötige, Group = Gruppieren by Block, Order = count -> zählen und Absteigend anzeigen, limit = 10 -> Die ersten 10
# Öffnet Verbindung
headers = {'bht': '4o5ugl8xsecpztbot159bxgjq'}
request = urllib.request.Request(url, headers = headers)
start_time = time.time()

# Anfrage senden
response = urllib.request.urlopen(request)
#Anfrage in Bytes lesen
data = response.read()

end_time = time.time()
print("Downloadtime", end_time - start_time, "Sekunden")
parsed_data = json.loads(data.decode()) # Bytes in JSON umwandeln

for eintrag in parsed_data:
    print(eintrag['block'], ":", eintrag['count'])

