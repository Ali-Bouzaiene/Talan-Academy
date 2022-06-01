import { Component, OnInit, Input} from '@angular/core';
import { FaceSnap } from '../models/face-snap.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  @Input() faceSnap!: FaceSnap;
  buttonText!: string;
  constructor() { }

  ngOnInit(): void {      
      this.buttonText= 'Oh Snap!';
    }
    onSnap(){
      if (this.buttonText === 'Oh Snap!') {
        this.faceSnap.snaps++;
        this.buttonText = 'Oops, unSnap!';
      } else {
        this.faceSnap.snaps--;
        this.buttonText = 'Oh Snap!';
      }
    }
  }


