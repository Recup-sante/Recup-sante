import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InscriptionAssociation } from './inscription-association';

describe('InscriptionAssociation', () => {
  let component: InscriptionAssociation;
  let fixture: ComponentFixture<InscriptionAssociation>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [InscriptionAssociation]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InscriptionAssociation);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
