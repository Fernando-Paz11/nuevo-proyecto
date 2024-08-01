/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

import fecha.Fecha;

/**
 *
 * @author Fernando Paz
 */
public class Persona {//clase externa
     private String nombre_completo;
     private Fecha fecha_nac;
     private String telefono;
     private String sexo;
     private String email;
     private Direccion direccion_casa;
     
     public Persona(){}
     
     public Persona(String nombre_completo, Fecha fecha_nac, String telefono, String sexo,String email,Direccion direccion_casa){
         this.nombre_completo=nombre_completo;
         this.fecha_nac=fecha_nac;
         this.telefono=telefono;
         this.sexo=sexo;
         this.email=email;
         this.direccion_casa=direccion_casa;
     }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public Fecha getFecha_nac() {
        return fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public Direccion getDireccion_casa() {
        return direccion_casa;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public void setFecha_nac(Fecha fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion_casa(Direccion direccion_casa) {
        this.direccion_casa = direccion_casa;
    }
     
    
     
     //-------->clase interna
     public class Direccion{
         private String calle;
         private String num_externo;
         private String num_interno;
         private String colonia;
         private String municipio;
         private String estado;
         private String cp;
         
         
         public Direccion(){}

        public Direccion(String calle, String num_externo, String num_interno, String colonia, String municipio, String estado, String cp) {
            this.calle = calle;
            this.num_externo = num_externo;
            this.num_interno = num_interno;
            this.colonia = colonia;
            this.municipio = municipio;
            this.estado = estado;
            this.cp = cp;
        }

        public String getCalle() {
            return calle;
        }

        public String getNum_externo() {
            return num_externo;
        }

        public String getNum_interno() {
            return num_interno;
        }

        public String getColonia() {
            return colonia;
        }

        public String getMunicipio() {
            return municipio;
        }

        public String getEstado() {
            return estado;
        }

        public String getCp() {
            return cp;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public void setNum_externo(String num_externo) {
            this.num_externo = num_externo;
        }

        public void setNum_interno(String num_interno) {
            this.num_interno = num_interno;
        }

        public void setColonia(String colonia) {
            this.colonia = colonia;
        }

        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public void setCp(String cp) {
            this.cp = cp;
        }
        
        public String datos(){
            return "Mombre completo: "+getNombre_completo()+" Sexo: "+ getSexo()+" Teléfono: "+getTelefono()
                    +" E-Mail: "+ getEmail()+ "Fecha de nacimiento: "+ getFecha_nac();
        }
        
        public String mostrar_direccion(){
            return "Mombre completo: "+getNombre_completo()+" Sexo: "+ getSexo()+" Teléfono: "+getTelefono()+"\n"
                    +" E-Mail: "+ getEmail()+ "Fecha de nacimiento: "+ getFecha_nac()+"\n"
                    +"Calle: "+getCalle()+" No. interno "+getNum_interno()+" No. externo "+getNum_externo()+"\n"
                    +", Col. "+getColonia()+",  "+getMunicipio()+", "+getEstado()+", "+getCp(); 
        }
     }     
}
