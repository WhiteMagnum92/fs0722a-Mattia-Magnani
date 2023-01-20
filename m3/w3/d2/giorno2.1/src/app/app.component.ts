import { Component } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  FormArray,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'giorno2.1';

  generi = ['uomo', 'donna'];
  form!: FormGroup;
  usernameProibiti = ['Mario', 'Anna'];

  constructor(private fb: FormBuilder) { }
  validUsername = (formC: FormControl) => {
    if (this.usernameProibiti.includes(formC.value)) {
      return { 'Username proibito': true };
    } else {
      return null;
    }

  }

  ngOnInit(): void {
    this.form = this.fb.group({
      userInfo: this.fb.group({
        username: this.fb.control(null, [Validators.required, this.validUsername]),
        email: this.fb.control(null, [Validators.required, Validators.email])
      }),
      genere: this.fb.control('donna'),
      sports: this.fb.array([])
    });
    this.form.valueChanges.subscribe(value => {
      console.log(value);
    })
  }
getErrorsC(name:string, error:string){
  return this.form.get(name)?.errors![error];
}
getFormC(name:string){
  return this.form.get(name);
}
getSportsF(){
  return (this.form.get('sports') as FormArray).controls;
}
addSports(){
  const control=
}
}
