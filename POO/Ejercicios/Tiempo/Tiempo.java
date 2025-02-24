public class Tiempo implements Comparable<Tiempo>{
    
    private Integer horas = 0;
    private Integer mins = 0;
    private Integer segs = 0;

    public Tiempo(){}

    public Tiempo(Integer horas, Integer mins, Integer segs){
        this.horas = horas;
        this.mins = mins;
        this.segs = segs;
    }

    public void suma(Tiempo tiempo2){

        int seg = this.segs + tiempo2.getSegs();
        this.segs = seg % 60;

        int min = this.mins + tiempo2.getMins() + (seg / 60);
        this.mins = min % 60;

        this.horas = this.horas + tiempo2.getHoras() + (min / 60);
    }

    public void resta(Tiempo tiempo2){

        int hora = this.horas - tiempo2.getHoras();
        int min = this.mins - tiempo2.getMins();
        int seg = this.segs - tiempo2.getSegs();

        if((hora < 0) || ((hora == 0) && (min < 0)) || ((hora == 0) && (min == 0)) && (seg <= 0)){
            this.horas = 0;
            this.mins = 0;
            this.segs = 0;
        }else{
            if(seg > 0){
                this.segs = seg;
            }else{
                min--;
                seg = seg + 60;
                this.segs = seg;
            }

            if(min > 0){
                this.mins = min;
            }else{
                hora--;
                min = min + 60;
                this.mins = min;
            }
            this.horas = hora;
        }
    }

    public int compareTo(Tiempo tiempo2){
        if(this.horas != tiempo2.getHoras()){
            return this.horas - tiempo2.getHoras();
        }else{
            if(this.mins != tiempo2.getMins()){
                return this.mins - tiempo2.getMins();
            }else{
                return this.segs + tiempo2.getSegs();
            }
        }
    }

    public Integer getHoras() {
        return this.horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMins() {
        return this.mins;
    }

    public void setMins(Integer mins) {
        this.mins = mins;
    }

    public Integer getSegs() {
        return this.segs;
    }

    public void setSegs(Integer segs) {
        this.segs = segs;
    }

    public String toString(){

        return this.horas + "h " + this.mins + "m " + this.segs + "s";
    }
}
