# shiny
Repository to add samples of my learnings and present my skills

## Docker / Podman 
<details>
<summary>docker commands to run an application</summary>

Command to build a application from Dockerfile
```
podman build -t my-image:latest .
```

Command to run application

```
podman run -p 3030:3030 my-image:latest
```
List pods running
```
podman ps
```
Kill application
```
podman stop <appname>
```
Prune Podman container
```
podman system prune --all
```

</details>


