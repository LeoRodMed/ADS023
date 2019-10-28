import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notas',
  templateUrl: './notas.page.html',
  styleUrls: ['./notas.page.scss'],
})
export class NotasPage implements OnInit {
  private NotaService notasService;
  titulo: string = 'Suas notas'
  notas: any;
  constructor() { 
     
  }

  ngOnInit() {
  }
  getNotas() {
    this.notas = this.notasSevice.getNotas();
    return [...this.notas];
  }
}
