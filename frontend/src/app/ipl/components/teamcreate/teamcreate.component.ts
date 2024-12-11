import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-teamcreate',
  templateUrl: './teamcreate.component.html',
  styleUrls: ['./teamcreate.component.scss']
})
export class TeamCreateComponent implements OnInit {
  teamForm!: FormGroup;
  successMessage: string | null = null;
  errorMessage: string | null = null;
  currentYear: number = new Date().getFullYear();

  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.teamForm = this.formBuilder.group({
      teamId: [null, [Validators.required]], // Team ID cannot be null
      teamName: ['', [Validators.required, Validators.pattern(/^[a-zA-Z0-9 ]+$/)]], // No special characters
      location: ['', [Validators.required]],
      ownerName: ['', [Validators.required, Validators.minLength(2)]],
      establishmentYear: [
        null,
        [Validators.required, Validators.min(1900), Validators.max(this.currentYear)]
      ]
    });
  }

  onSubmit(): void {
    if (this.teamForm.valid) {
      // Simulate backend call and handle error messages
      const backendError = this.simulateBackendError();
      if (backendError) {
        this.errorMessage = backendError;
        this.successMessage = null;
      } else {
        this.successMessage = 'Team has been successfully created!';
        this.errorMessage = null;
        console.log('Team Created: ', this.teamForm.value);
        this.resetForm();
      }
    } else {
      this.errorMessage = 'Please fill out all required fields correctly.';
      this.successMessage = null;
    }
  }

  simulateBackendError(): string | null {
    // Simulate a backend error based on some condition
    const teamName = this.teamForm.get('teamName')?.value;
    if (teamName === 'ErrorTeam') {
      return 'Team name already exists.';
    }
    return null;
  }

  resetForm(): void {
    this.teamForm.reset({
      teamId: null,
      teamName: '',
      location: '',
      ownerName: '',
      establishmentYear: this.currentYear
    });
  }
}
