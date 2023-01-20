import { Component, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'giorno2';
  stampa:boolean=false;

  @ViewChild('form', { static: true }) form!: NgForm;

  userForm = {
    defUserName: '',
    email: '',
    question: ''
  }

  generi = [
    {
      label: 'uomo',
      value: 'uomo'
    },
    {
      label: 'donna',
      value: 'donna'
    }
  ]

  risposta = '';

  user: any = {
    username: '',
    email: '',
    secret: '',
    sesso: '',
    risposta: ''
  }

  NgOnInit(): void {
    this.form.statusChanges?.subscribe(status => {
      console.log("stato del form", status);
    });
  }

  generateUsername() {
    this.form.form.patchValue({
      userInfo: {
        email: 'pippo@pippo.com',
        username: 'pippo'
      }
    });
  }
  submit() {
    console.log("form inviato", this.form);
    this.user.username = this.form.value.userInfo.username;
    this.user.email = this.form.value.userinfo.email;
    this.user.secret = this.form.value.userinfo.secret;
    this.user.sesso = this.form.value.userinfo.sesso;
    this.user.risposta = this.form.value.userinfo.risposta;

    this.form.reset();
  }
}
