import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'giorno3';

  users = [
    {
      nome: 'Mario',
      cognome: 'Rossi'
    },
    {
      nome: 'Mariuccio',
      cognome: 'Verdi'
    },
    {
      nome: 'Giorgina',
      cognome: 'Arancini'
    }
  ]
}
