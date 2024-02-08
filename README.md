# Tutorial Hibernate


GET all tutorials
```bash
curl -vvvv http://localhost:8080/api/tutorials
```
GET one tutorial by ID
```bash
curl -vvvv http://localhost:8080/api/tutorials/1
```
ADD
```bash
curl -vvvv -X POST -H "Content-Type: application/json" http://localhost:8080/api/tutorials -d '{"title":"one","description":"desc"}'&&\
curl -vvvv -X POST -H "Content-Type: application/json" http://localhost:8080/api/tutorials -d '{"title":"TWO","description":"Descent"}'
```
UPDATE
```bash
curl -vvvv -X PUT -H "Content-Type: application/json" http://localhost:8080/api/tutorials/2 -d '{"title":"TWO","description":"Descent","published":true}'
```
DELETE
```bash
curl -vvvv -X DELETE http://localhost:8080/api/tutorials/1
curl -vvvv -X DELETE http://localhost:8080/api/tutorials
```
GET by Published
```bash
curl http://localhost:8080/api/tutorials/published
```