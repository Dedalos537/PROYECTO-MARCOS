// Source code is decompiled from a .class file using FernFlower decompiler.
package com.mtw.logeoregistrar.DTO;

public class ReservaDto{
   private Long id;
   private String nombre;
   private String email;
   private String telefono;
   private Integer invitados;
   private String fecha;
   private String hora;

   public ReservaDto(Long id, String nombre, String email, String telefono, Integer invitados, String fecha, String hora) {
      this.id = id;
      this.nombre = nombre;
      this.email = email;
      this.telefono = telefono;
      this.invitados = invitados;
      this.fecha = fecha;
      this.hora = hora;
   }

   public ReservaDto(String nombre, String email, String telefono, Integer invitados, String fecha, String hora) {
      this.nombre = nombre;
      this.email = email;
      this.telefono = telefono;
      this.invitados = invitados;
      this.fecha = fecha;
      this.hora = hora;
   }

   public ReservaDto() {
   }

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getTelefono() {
      return this.telefono;
   }

   public void setTelefono(String telefono) {
      this.telefono = telefono;
   }

   public Integer getInvitados() {
      return this.invitados;
   }

   public void setInvitados(Integer invitados) {
      this.invitados = invitados;
   }

   public String getFecha() {
      return this.fecha;
   }

   public void setFecha(String fecha) {
      this.fecha = fecha;
   }

   public String getHora() {
      return this.hora;
   }

   public void setHora(String hora) {
      this.hora = hora;
   }

   public String toString() {
      String var10000 = String.valueOf(this.id);
      return "ReservaDto [id=" + var10000 + ", nombre=" + this.nombre + ", email=" + this.email + ", telefono=" + this.telefono + ", invitados=" + String.valueOf(this.invitados) + ", fecha=" + this.fecha + ", hora=" + this.hora + "]";
   }
}
