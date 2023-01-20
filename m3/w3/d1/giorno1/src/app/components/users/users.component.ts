import { Component, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {

  sub!: Subscription;
  conteggio: number = 0;

  constructor() { }

  ngOnInit(): void {

    const intervallo = new Observable(observer => {
      let count = 0;
      setInterval(() => {
        observer.next(count);
        if (count === 5) {
          observer.complete();
          console.log('Observer completato!');
        }
        if (count > 3) {
          observer.error(new Error('Count e troppo grande'));
        }
        count++;
      }, 1000);

    });
    this.sub = intervallo.pipe(map((conta) => {
      this.conteggio = Number(conta);
      return `siamo al numero ${conta}`;
    })).subscribe(numero => {
      console.log(numero);
    }, (error) => {
      console.log(error);
      alert(error);
    }, () => {
      console.log('Observable completato');
    });
  }
  ngOnDestroy(): void {
    this.sub.unsubscribe();
    console.log('Observable scaricato!')
  }
}
