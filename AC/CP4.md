# AC 7 10 22

## CP 4 :

---

    cr - tiempo de un ciclo de reloj (seg/ciclo)
    cb - tiempo de un ciclo de bus (seg/ciclo)
    fr - velocidad de un ciclo de reloj (ciclos/seg)(Hz)
    fb - velocidad de un ciclo de bus (ciclos/seg)(Hz)
    vt - velocidad de transferencia (Byte/seg)
    cbc - cantidad de Bytes por ciclo (Byte/ciclo)

    vt(B/s) = cbc(B/ciclo) * fb(ciclo/s)  
    cb = 1/fb  
    cr = 1/fr

**3.5**  
**Datos**  
fr = 8MHz  
cb = 4 * cr  
cbc = 2B/ciclo  
vt = ?

cr = 1/8MHz => cb = 4/8  
cb = 1/2 s/c

fb = 1/cb = 1/(1/2) = 2
fb = 2 c/s

vt = cbc * fb  
vt = 2B/c * 2MHz  
```
1MHz = 1000000 c/s
```
vt = 2B/c * 2000000 c/s  
R/ vt = 4000000 B/s  

